package com.coledspot.demo.domain.maria.client;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
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
	
	
	
	private String delyn;
	private LocalDateTime createdate = LocalDateTime.now();
	private LocalDateTime modifieddate ;
}
