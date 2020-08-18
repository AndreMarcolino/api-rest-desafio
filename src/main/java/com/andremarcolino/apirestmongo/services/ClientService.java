package com.andremarcolino.apirestmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andremarcolino.apirestmongo.domain.Client;
import com.andremarcolino.apirestmongo.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repo;
	
	public List<Client> findAll(){
		return repo.findAll();
	}

}
