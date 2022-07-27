package com.coledspot.demo.domain.maria.member;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MemberResDTO {
	
	private Integer memberid;	
	private String membername;
	private String accountid;
	private String password;	
	private LocalDateTime lastAccessDt;
	private LocalDateTime regDt;
	private Integer role;
	private Integer groupid;
	private Integer recommendcnt;
	private Integer useyn;

	public MemberEntity toEntity() {
		return MemberEntity.builder().
				membername(membername).
				accountid(accountid).
				password(password).
				role(role).
				groupid(groupid).
				recommendcnt(recommendcnt).
				useyn(useyn).
		build();
	}
	
	
}
