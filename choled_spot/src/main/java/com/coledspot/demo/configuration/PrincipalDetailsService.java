package com.coledspot.demo.configuration;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.coledspot.demo.repository.maria.member.MemberRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class PrincipalDetailsService implements UserDetailsService {

	
    private final MemberRepository memberRepository;
    
    
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
	//	Member member = memberRepository.findb
		
		return null;
	}

}
