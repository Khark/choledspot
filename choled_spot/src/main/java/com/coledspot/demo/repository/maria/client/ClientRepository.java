package com.coledspot.demo.repository.maria.client;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coledspot.demo.domain.maria.client.ClientEntity;

public interface ClientRepository extends JpaRepository<ClientEntity, Integer>{

	
}
