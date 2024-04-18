package com.example.MelissaServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MelissaEntities.Pedido;
import com.example.MelissaRepositories.PedidoRepository;

@Service
public class PedidoService {
	private final PedidoRepository pedidoRepository;

	    //construtor que recebe a dependencia
	    
	    @Autowired
	    public PedidoService(PedidoRepository pedidoRepository) {
	        this.pedidoRepository = pedidoRepository;
	    }

	    public Pedido savePedido(Pedido pedido) {
	        return pedidoRepository.save(pedido);
	    }

	    public Pedido getPedidoById(Long id) {
	        return pedidoRepository.findById(id).orElse(null);
	    }

	    public List<Pedido> getAllPedidos() {
	        return pedidoRepository.findAll();
	    }

	    public void deletePedido(Long id) {
	        pedidoRepository.deleteById(id);
	    }
	}