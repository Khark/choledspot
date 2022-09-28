package com.coledspot.demo.configuration;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.coledspot.demo.svc.member.MemberSvc;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private MemberSvc membersvc;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/js/**", "/img/**", "/lib/**");
	}
	
	@Override
	protected void configure(HttpSecurity http ) throws Exception {
		http
        // 비동기를 사용하기 위한 disable
		.csrf().disable();
		
		http.sessionManagement()
        .maximumSessions(1)
        .maxSessionsPreventsLogin(true)
        
        ;
		http.authorizeRequests()
			.antMatchers("/manage/**").authenticated()
			.antMatchers("/member/**").authenticated()
			.antMatchers("/manage/**").hasRole("ADMIN")
			.antMatchers("/client/**").hasRole("CLIENT")
			.anyRequest().permitAll()
		;
		
		
		 http.formLogin()
         .loginPage("/login")
         .defaultSuccessUrl("/home") // 성공했을 때 가는 주소 
         .permitAll();
		
		  http.logout()
          .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
          .logoutSuccessUrl("/login")
          .invalidateHttpSession(true);
		  // 세션timeout 은 application.yml 에 설정한다. 
  
		  http.exceptionHandling()
          .accessDeniedPage("/denied");
	}
	
   @Override
   public void configure(AuthenticationManagerBuilder auth ) throws Exception {
	   	System.out.println("#######");
   		auth.userDetailsService(membersvc).passwordEncoder(passwordEncoder());
   		
	}
	
	
    
}
