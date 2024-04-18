package com.example.MelissaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MelissaEntities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
}
