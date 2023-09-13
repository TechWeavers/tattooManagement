package com.techweavers.tattooManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.techweavers.tattooManagement.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{

     @Query("SELECT c FROM Cliente c WHERE c.nome = :nome")
     Cliente findByNome(@Param("nome") String nome);
}
