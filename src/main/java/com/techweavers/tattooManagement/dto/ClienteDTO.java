package com.techweavers.tattooManagement.dto;

import com.techweavers.tattooManagement.entity.Cliente;
import com.techweavers.tattooManagement.entity.ClienteEndereco;

import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {
	
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	@Embedded
	private ClienteEndereco endereco;
	private String redeSocial;
	private String fichaAnamnese;

	public static ClienteDTO retornaCliente(Cliente cliente) {
		ClienteDTO clienteDTO = new ClienteDTO(cliente.getNome(), cliente.getCpf(), cliente.getTelefone(), cliente.getEmail(), cliente.getEndereco(), cliente.getRedeSocial(), cliente.getFichaAnamnese());
		return clienteDTO;
		
	}
	
	public static Cliente retornaCliente(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente(clienteDTO.getNome(), clienteDTO.getCpf(), clienteDTO.getTelefone(), clienteDTO.getEmail(), clienteDTO.getEndereco(), clienteDTO.getRedeSocial(), clienteDTO.getFichaAnamnese());
		return cliente;
		
	}
	
}
