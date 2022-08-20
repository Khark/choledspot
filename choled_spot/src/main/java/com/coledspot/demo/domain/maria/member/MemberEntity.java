package com.coledspot.demo.domain.maria.member;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="MEMBER")
@Table(name="MEMBER")
@Setter
@Getter
@NoArgsConstructor

public class MemberEntity  {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer memberid;	
	
	@Column(name ="membername")
	private String membername;
	
	@Column(name ="account_id")
	private String accountid;
	
	@Column(name ="password")
	private String password;	
	
	@Column(name = "last_access_dt")
	private LocalDateTime lastAccessDt;

	@Column(name = "reg_dt")
	private LocalDateTime regDt;
	
	@Column(length =11 , nullable = false)
	private Integer role;
	
	@Column(name="groupid" )
	private Integer groupid;
	
	@Column(name="recommendcnt" )
	private Integer recommendcnt;
	
	@Column(name="useyn" )
	private String useyn;

	@Builder
	public MemberEntity(String membername, String accountid, String password, Integer role, Integer groupid, Integer recommendcnt, String useyn) {
		
		this.membername = membername;
		this.accountid = accountid;
		this.password = password;
		this.role = role;
		this.groupid = groupid;
		this.recommendcnt = recommendcnt;
		this.useyn = useyn;

	}
	
	@Transient
	private String msg;
	@Transient
	private String result;
	@Transient
	private String error;
	
}
