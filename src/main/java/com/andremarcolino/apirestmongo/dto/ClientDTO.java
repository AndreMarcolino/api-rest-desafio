package com.andremarcolino.apirestmongo.dto;

import java.io.Serializable;

import com.andremarcolino.apirestmongo.domain.Client;

public class ClientDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String cpf;
	private String address;
	
	public ClientDTO() {
	}
	
	public ClientDTO(Client obj) {
		id = obj.getId();
		name = obj.getName();
		cpf = obj.getCpf();
		address = obj.getAddress();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
