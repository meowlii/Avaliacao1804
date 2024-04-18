package com.example.MelissaControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MelissaEntities.ItemPedido;
import com.example.MelissaServices.ItemPedidoService;

@RestController
	@RequestMapping("/itemPedido")
	public class ItemPedidoController {

		private final ItemPedidoService itemPedidoService;

		@Autowired
		public ItemPedidoController(ItemPedidoService itemPedidoService) {
			this.itemPedidoService = itemPedidoService;
		}

		@GetMapping("/{id}")
		public ResponseEntity<ItemPedido> findItemPedidobyId(@PathVariable Long id) {
			ItemPedido itemPedido = itemPedidoService.getItemPedidoById(id);
			if (itemPedido != null) {
				return ResponseEntity.ok(itemPedido);
			} else {
				return ResponseEntity.notFound().build();
			}
		}

		@GetMapping("/")
		public ResponseEntity<List<ItemPedido>> findAllUsuarioscontrol() {
			List<ItemPedido> itemPedido = itemPedidoService.getAllItemPedidoes();
			return ResponseEntity.ok(itemPedido);
		}

		@PostMapping("/")
		public ResponseEntity<ItemPedido> insertUsuariosControl(@RequestBody ItemPedido itemPedido) {
			ItemPedido novoitemPedido = itemPedidoService.saveItemPedido(itemPedido);
			return ResponseEntity.status(HttpStatus.CREATED).body(novoitemPedido);
		}
	}
