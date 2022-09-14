package com.coledspot.demo.svc.client;

import java.util.List;

import com.coledspot.demo.domain.maria.client.ClientReqDTO;
import com.coledspot.demo.domain.maria.client.ClientResDTO;

public interface ClientSvc {
	
	public Integer save(ClientReqDTO dto);
	public List<ClientResDTO > findAll();
	public ClientResDTO findById(Integer clientid);

}
