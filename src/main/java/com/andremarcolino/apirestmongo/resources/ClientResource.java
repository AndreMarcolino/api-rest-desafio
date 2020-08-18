package com.andremarcolino.apirestmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andremarcolino.apirestmongo.domain.Client;

@RestController
@RequestMapping(value="/clients")
public class ClientResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Client>> findAll() {
		Client jose = new Client("1", "Jose da Silva", "5764876486", "Rua de cima");
		Client maria = new Client("2", "Maria Marcolino", "876985968", "Rua de baixo");
		List<Client> list = new ArrayList<>();
		list.addAll(Arrays.asList(jose, maria));
		return ResponseEntity.ok().body(list);
	}
}