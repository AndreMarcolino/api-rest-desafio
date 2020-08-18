package com.andremarcolino.apirestmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.andremarcolino.apirestmongo.domain.Client;
import com.andremarcolino.apirestmongo.repository.ClientRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public void run(String... arg0) throws Exception {

		clientRepository.deleteAll();

		Client maria = new Client(null, "Israel Francisco", "754675476","Rua de campos");
		Client ricardo = new Client(null, "Ricardo Gomes", "6767648754","Rua radialista pajeu");
		Client pedro = new Client(null, "Pedro Silva", "7658764563","Rua das flores");

		clientRepository.saveAll(Arrays.asList(maria, ricardo, pedro));
	}

}