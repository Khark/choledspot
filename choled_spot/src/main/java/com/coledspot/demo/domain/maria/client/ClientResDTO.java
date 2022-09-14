package com.coledspot.demo.domain.maria.client;

import lombok.Getter;

@Getter
public class ClientResDTO {

	private Integer clientid;
	private Integer memberid;
	
	private String client_name;
	private String client_info;
	
	private String delyn;
	
	
	public ClientResDTO(ClientEntity entity) {
		super();
		this.clientid = entity.getClientid();
		this.memberid = entity.getMemberid();
		this.client_name = entity.getClient_name();
		this.client_info = entity.getClient_info();
		this.delyn = entity.getDelyn();
	}

	@Override
	public String toString() {
		return "ClientReqDTO [clientid=" + clientid + ", memberid=" + memberid + ", client_name=" + client_name
				+ ", client_info=" + client_info + ", delyn=" + delyn + "]";
	}

	
}
