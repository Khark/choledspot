package com.coledspot.demo.domain.maria.member;

import java.time.LocalDateTime;

import lombok.Getter;


@Getter
public class MemberReqDTO {

	
	
	private Integer memberid;	
	private String membername;
	private String account_id;
	private String password;	
	private LocalDateTime lastAccessDt;
	private LocalDateTime regDt;
	private Integer role;
	private Integer groupid;
	private Integer recommendcnt;
	private Integer useyn;
	
	
	
	public MemberReqDTO(MemberEntity entity) {
		super();
		this.memberid = entity.getMemberid();
		this.membername = entity.getMembername();
		this.account_id = entity.getAccount_id();
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
		return "MemberReqDTO [memberid=" + memberid + ", membername=" + membername + ", account_id=" + account_id
				+ ", password=" + password + ", lastAccessDt=" + lastAccessDt + ", regDt=" + regDt + ", role=" + role
				+ ", groupid=" + groupid + ", recommendcnt=" + recommendcnt + ", useyn=" + useyn + "]";
	}
	
	
	
}
