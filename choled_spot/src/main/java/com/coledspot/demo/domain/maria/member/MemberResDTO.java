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

	

	public MemberResDTO(MemberEntity entity) {
		super();
		this.memberid = entity.getMemberid();
		this.membername = entity.getMembername();
		this.accountid = entity.getAccountid();
		this.password = entity.getPassword();
		this.lastAccessDt = entity.getLastAccessDt();
		this.regDt = entity.getRegDt();
		this.role = entity.getRole();
		this.groupid = entity.getGroupid();
		this.recommendcnt = entity.getRecommendcnt();
		this.useyn = entity.getGroupid();
	}


	@Override
	public String toString() {
		return "MemberResDTO [memberid=" + memberid + ", membername=" + membername + ", accountid=" + accountid
				+ ", password=" + password + ", lastAccessDt=" + lastAccessDt + ", regDt=" + regDt + ", role=" + role
				+ ", groupid=" + groupid + ", recommendcnt=" + recommendcnt + ", useyn=" + useyn + "]";
	}
	
	
}
