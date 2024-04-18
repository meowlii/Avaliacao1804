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

import com.example.MelissaEntities.Cliente;
import com.example.MelissaServices.ClienteService;

@RestController
	@RequestMapping("/cliente")
	public class ClienteController {

		private final ClienteService clienteService;

		@Autowired
		public ClienteController(ClienteService clienteService) {
			this.clienteService = clienteService;
		}

		@GetMapping("/{id}")
		public ResponseEntity<Cliente> findClientebyId(@PathVariable Long id) {
			Cliente cliente = clienteService.getClienteById(id);
			if (cliente != null) {
				return ResponseEntity.ok(cliente);
			} else {
				return ResponseEntity.notFound().build();
			}
		}

		@GetMapping("/")
		public ResponseEntity<List<Cliente>> findAllUsuarioscontrol() {
			List<Cliente> cliente = clienteService.getAllClientees();
			return ResponseEntity.ok(cliente);
		}

		@PostMapping("/")
		public ResponseEntity<Cliente> insertUsuariosControl(@RequestBody Cliente cliente) {
			Cliente novocliente = clienteService.saveCliente(cliente);
			return ResponseEntity.status(HttpStatus.CREATED).body(novocliente);
		}
	}
