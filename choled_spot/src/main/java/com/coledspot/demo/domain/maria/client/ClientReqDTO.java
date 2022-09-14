package com.coledspot.demo.domain.maria.client;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@JsonAutoDetect
@NoArgsConstructor
public class ClientReqDTO {
	private Integer clientid;
	private Integer memberid;
	
	private String client_name;
	private String client_info;
	
	private String delyn;
	
	public ClientEntity toEntity() {
		return ClientEntity.builder().
				clientid(clientid).
				memberid(memberid).
				client_name(client_name).
				client_info(client_info).
				delyn(delyn).build();
	}


}
