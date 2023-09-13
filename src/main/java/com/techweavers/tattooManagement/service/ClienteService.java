package com.techweavers.tattooManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techweavers.tattooManagement.dto.ClienteDTO;
import com.techweavers.tattooManagement.entity.Cliente;
import com.techweavers.tattooManagement.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteService {
	
	private ClienteRepository clienteRepository;
	
	public Cliente cadastrarCliente(ClienteDTO clienteDTO) {
		Cliente cliente = ClienteDTO.retornaCliente(clienteDTO);
		return this.clienteRepository.save(cliente);

	}
	
	public List<Cliente> listarClientes() {
		return this.clienteRepository.findAll();

	}
	
	public Cliente buscarCliente(String nome) {
		return this.clienteRepository.findByNome(nome);

	}
	
	public void deletarCliente(String nome) {
		Cliente clienteEncontrado = this.clienteRepository.findByNome(nome);
		this.clienteRepository.delete(clienteEncontrado);
	}
	
	public void alterarCliente() {
		// TODO Auto-generated method stub

	}

}
