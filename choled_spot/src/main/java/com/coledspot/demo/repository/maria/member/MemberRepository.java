package com.coledspot.demo.repository.maria.member;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coledspot.demo.domain.maria.member.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Integer>{

	
//	Optional<MemberEntity> findByAccount_id(String account_id);
	
	Optional<MemberEntity> findByAccountid(String accountid);
}
