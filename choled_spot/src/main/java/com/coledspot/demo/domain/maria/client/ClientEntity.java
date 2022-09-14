package com.coledspot.demo.domain.maria.client;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="client")

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class ClientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer clientid;
	private Integer memberid;
	
	private String client_name;
	private String client_info;
	
	
	
	private String delyn;
	private LocalDateTime createdate = LocalDateTime.now();
	private LocalDateTime modifieddate ;
	
	//generate constructor using fields 
	// 로 생성후 Builder Annotation 붙여줌 

	@Builder
	public ClientEntity(Integer clientid, Integer memberid, String client_name, String client_info, String delyn,
			LocalDateTime createdate, LocalDateTime modifieddate) {
		this.clientid = clientid;
		this.memberid = memberid;
		this.client_name = client_name;
		this.client_info = client_info;
		this.delyn = delyn;
		this.createdate = createdate;
		this.modifieddate = modifieddate;
	}
	// @Transient 는해당 entity 에 없는 컬럼을 넣고자 사용하고자 ㄷ할 때 상
	@Transient
	private String msg;
	@Transient
	private String result;
	@Transient
	private String error;
	
}
