package com.techweavers.tattooManagement.entity;


import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message = "O nome é obrigatório.") 
	private String nome;
	private String cpf;
	@NotEmpty(message = "O telefone é obrigatório.") 
	private String telefone;
	private String email;
	@Valid
	@Embedded
	private ClienteEndereco endereco;
	private String redeSocial;
	private String fichaAnamnese;
	
	public Cliente(String nome, String cpf,String telefone, String email, ClienteEndereco endereco, String redeSocial, String fichaAnamnese) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.redeSocial = redeSocial;
		this.fichaAnamnese = fichaAnamnese;
	}
	
	
}
