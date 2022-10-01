package com.coledspot.demo.domain.maria.member;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@JsonAutoDetect
@NoArgsConstructor
public class MemberReqDTO {

	
	
	private Integer memberid;	
	private String membername;
	private String accountid;
	private String password;	
	private LocalDateTime lastAccessDt;
	private LocalDateTime regDt;
	private Integer role;
	private Integer groupid;
	private Integer recommendcnt;
	private String useyn;
	private String email;
	
	public MemberEntity toEntity() {
		return MemberEntity.builder().
				membername(membername).
				accountid(accountid).
				password(password).
				role(role).
				groupid(groupid).
				recommendcnt(recommendcnt).
				useyn(useyn).
				email(email).
				build();
	}
	
	
	
}
