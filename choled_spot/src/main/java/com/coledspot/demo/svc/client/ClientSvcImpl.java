package com.coledspot.demo.svc.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.coledspot.demo.domain.maria.client.ClientReqDTO;
import com.coledspot.demo.domain.maria.client.ClientResDTO;
import com.coledspot.demo.repository.maria.client.ClientRepository;

public class ClientSvcImpl implements ClientSvc {

	@Autowired
	ClientRepository clientRepository;
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public Integer save(ClientReqDTO dto) {
		// TODO Auto-generated method stub
		clientRepository.save(dto.toEntity()).getClientid();
		
		return null;
	}

	@Override
	public List<ClientResDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientResDTO findById(Integer clientid) {
		// TODO Auto-generated method stub
		return null;
	}

} 
