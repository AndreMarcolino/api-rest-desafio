package com.andremarcolino.apirestmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andremarcolino.apirestmongo.domain.Client;
import com.andremarcolino.apirestmongo.dto.ClientDTO;
import com.andremarcolino.apirestmongo.repository.ClientRepository;
import com.andremarcolino.apirestmongo.services.exception.ObjectNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repo;

	public List<Client> findAll() {
		return repo.findAll();
	}
	
	public Client findById(String id) {
		Optional<Client> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Valor não encontrado"));
	}
	
	public Client insert(Client obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public Client fromDTO(ClientDTO objDto) {
		return new Client(objDto.getId(), objDto.getName(), objDto.getCpf(), objDto.getAddress());
	}
}
