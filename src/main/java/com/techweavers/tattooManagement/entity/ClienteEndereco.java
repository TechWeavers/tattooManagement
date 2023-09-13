package com.techweavers.tattooManagement.entity;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteEndereco {
	
	private String estado;
	private String cidade;
    @NotEmpty(message = "A rua é obrigatória")
	private String rua;
    @NotNull(message = "O número é obrigatório")
	private int numero;
	private String complemento;
    @NotEmpty(message = "O CEP é obrigatório")
	private String cep;	

}
