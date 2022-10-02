package com.coledspot.demo.configuration;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.coledspot.demo.domain.maria.member.MemberEntity;

public class PrincipalDetails implements UserDetails {

	private Member member;  // 콤포지션
	private MemberEntity memberentity;
    // 생성자를 통해서 유저 정보(Member)를 넣어준다.
    public PrincipalDetails(Member member) {
        this.member = member;
    }
    
    
 // 해당 User의 권한을 리턴하는 곳.
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Collection<GrantedAuthority> collect = new ArrayList<>();
        // 권한을 넣어준다. 권한이 여러개라면 여러개 넣어줄 수도 있다.

    //    collect.add(new SimpleGrantedAuthority(memberentity.getRole()) )
        return collect;
    }

	
	

    // 아래의 녀석들은 기본 값이 다 false로 되어있는데 true로 바꿔두자. 지금 당장 쓸일이 없기 때문, 만약 쓸일이 생기면 로직넣어서 true,false 골라주면 된다.
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // 사용가능한지 물어보는데 이거를 사용해서 로그인 한지 얼마 지나면 계정이 잠기도록 하는 로직을 짤 수도 있다. false로 바꾸면된다.
    @Override
    public boolean isEnabled() {
        return true;
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
}
