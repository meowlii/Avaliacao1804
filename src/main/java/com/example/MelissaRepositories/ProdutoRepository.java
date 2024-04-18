package com.example.MelissaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MelissaEntities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
}