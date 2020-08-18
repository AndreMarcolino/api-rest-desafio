package com.andremarcolino.apirestmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andremarcolino.apirestmongo.domain.Client;
import com.andremarcolino.apirestmongo.dto.ClientDTO;
import com.andremarcolino.apirestmongo.services.ClientService;

@RestController
@RequestMapping(value="/clients")
public class ClientResource {
	
	@Autowired
	private ClientService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<ClientDTO>> findAll() {
		List<Client> list = service.findAll();
		List<ClientDTO> listDto = list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<ClientDTO> findById(@PathVariable String id) {
		Client obj = service.findById(id);
		return ResponseEntity.ok().body(new ClientDTO(obj));
	}
}