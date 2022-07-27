package com.coledspot.demo.svc.member;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.coledspot.demo.domain.maria.member.MemberEntity;
import com.coledspot.demo.repository.maria.member.MemberRepository;

@Service
public class MemberSvcImpl implements MemberSvc {

	@Autowired
	private MemberRepository memberRepository;

	@Override
	public UserDetails loadUserByUsername(String accountid) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<MemberEntity> memberEntityWrapper = memberRepository.findByAccountid(accountid);
		
		return null;
	}
	
//	@Override
//	public UserDetails loadUserByUsername(String accountid) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		Optional<MemberEntity> memberEntityWrapper = memberRepository.findByAccount_id(accountid);
//		MemberEntity memberEntity = memberEntityWrapper.orElse(null);
//		
//		List<GrantedAuthority> authorites = new ArrayList<>();
//		
//		
//		
//		return new User( memberEntity.getAccountid() , memberEntity.getPassword() ,authorites );
//	}

}
