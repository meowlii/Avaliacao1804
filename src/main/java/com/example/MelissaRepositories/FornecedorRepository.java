package com.example.MelissaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MelissaEntities.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
	
}
