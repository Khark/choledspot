package com.coledspot.demo.domain.maria.member;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="member")
@Setter
@Getter
@NoArgsConstructor

public class MemberEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer memberid;	
	
	@Column(name ="membername")
	private String membername;
	
	@Column(name ="account_id")
	private String account_id;
	
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
	private Integer useyn;

	@Builder
	public MemberEntity(String membername, String account_id, String password, Integer role, Integer groupid, Integer recommendcnt, Integer useyn) {
		
		this.membername = membername;
		this.account_id = account_id;
		this.password = password;
		this.role = role;
		this.groupid = groupid;
		this.recommendcnt = recommendcnt;
		this.useyn = useyn;

	}
	
	
}
