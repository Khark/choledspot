package com.coledspot.demo.svc.member;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.coledspot.demo.domain.maria.member.MemberEntity;
import com.coledspot.demo.domain.maria.member.MemberReqDTO;
import com.coledspot.demo.repository.maria.member.MemberRepository;

@Service
public class MemberSvcImpl implements MemberSvc {

	@Autowired
	private MemberRepository memberRepository;

	@Override
	public UserDetails loadUserByUsername(String accountid) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<MemberEntity> memberEntityWrapper = memberRepository.findByAccountid(accountid);
		MemberEntity memberEntity = memberEntityWrapper.orElse(null);
		List<GrantedAuthority> authorites = new ArrayList<>();
		
		switch (memberEntity.getRole()) {
		case 1 :
			authorites.add(new SimpleGrantedAuthority("ROLE_MEMBER")); // 1인 그룹은 회원 
			break;
		case 2 :
			authorites.add(new SimpleGrantedAuthority("ROLE_CLIENT")); // 2인 그룹은 사업체  
			break;
		case 9 : 	
			authorites.add(new SimpleGrantedAuthority("ROLE_ADMIN")); // 9인 그룹은 관리자
			break;
		default:
			break;
		}
		
		return new User( memberEntity.getAccountid() , memberEntity.getPassword() ,authorites );
	}

	@Override
	public Integer save(MemberReqDTO dto) {
		// TODO Auto-generated method stub
		
		MemberEntity member = dto.toEntity();
		member.setLastAccessDt(LocalDateTime.now());
		member.setRegDt(LocalDateTime.now());
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		member.setPassword(passwordEncoder.encode(member.getPassword()));

		return memberRepository.save(member).getMemberid();
		
	}

	@Override
	public HashMap<String, Object> findAll(Integer page, Integer size) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
