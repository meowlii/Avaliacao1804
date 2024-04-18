package com.example.MelissaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MelissaEntities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
}
