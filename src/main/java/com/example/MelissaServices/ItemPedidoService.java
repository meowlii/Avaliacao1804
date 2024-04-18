package com.example.MelissaServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MelissaEntities.ItemPedido;
import com.example.MelissaRepositories.ItemPedidoRepository;

@Service
public class ItemPedidoService {
    private final ItemPedidoRepository itemPedidoRepository;

	//construtor que recebe a dependencia
	    
	@Autowired
	public ItemPedidoService(ItemPedidoRepository itemPedidoRepository) {
	   this.itemPedidoRepository = itemPedidoRepository;
	}

	public ItemPedido saveItemPedido(ItemPedido itemPedido) {
	   return itemPedidoRepository.save(itemPedido);
	}

	public ItemPedido getItemPedidoById(Long id) {
	   return itemPedidoRepository.findById(id).orElse(null);
	}

	public List<ItemPedido> getAllItemPedidoes() {
	   return itemPedidoRepository.findAll();
	}

	public void deleteItemPedido(Long id) {
	   itemPedidoRepository.deleteById(id);
	}
}