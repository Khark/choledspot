package com.coledspot.demo.configuration;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class PincipalDetails implements UserDetails {

	
	private Member member;  // 콤포지션

    // 생성자를 통해서 유저 정보(Member)를 넣어준다.
    public PrincipalDetails(Member member) {
        this.member = member;
    }
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		Collection<GrantedAuthority> collect = new ArrayList<>();

        // 권한을 넣어준다. 권한이 여러개라면 여러개 넣어줄 수도 있다.
        collect.add(new SimpleGrantedAuthority(member.getRole().name()));

        return collect;

	}

	
	
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	
    // 사용가능한지 물어보는데 이거를 사용해서 로그인 한지 얼마 지나면 계정이 잠기도록 하는 로직을 짤 수도 있다. false로 바꾸면된다.
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
