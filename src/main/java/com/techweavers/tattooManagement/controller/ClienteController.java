package com.techweavers.tattooManagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techweavers.tattooManagement.dto.ClienteDTO;
import com.techweavers.tattooManagement.entity.Cliente;
import com.techweavers.tattooManagement.service.ClienteService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/clientes")
@AllArgsConstructor
public class ClienteController {
	
	private ClienteService clienteService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente cadastrarCliente(@Valid @RequestBody ClienteDTO clienteDTO) {
		Cliente novoCliente = this.clienteService.cadastrarCliente(clienteDTO);
		return novoCliente;

	}

}
