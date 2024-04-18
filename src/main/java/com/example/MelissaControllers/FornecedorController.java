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

import com.example.MelissaEntities.Fornecedor;
import com.example.MelissaServices.FornecedorService;

@RestController
	@RequestMapping("/fornecedor")
	public class FornecedorController {

		private final FornecedorService fornecedorService;

		@Autowired
		public FornecedorController(FornecedorService fornecedorService) {
			this.fornecedorService = fornecedorService;
		}

		@GetMapping("/{id}")
		public ResponseEntity<Fornecedor> findFornecedorbyId(@PathVariable Long id) {
			Fornecedor fornecedor = fornecedorService.getFornecedorById(id);
			if (fornecedor != null) {
				return ResponseEntity.ok(fornecedor);
			} else {
				return ResponseEntity.notFound().build();
			}
		}

		@GetMapping("/")
		public ResponseEntity<List<Fornecedor>> findAllUsuarioscontrol() {
			List<Fornecedor> fornecedor = fornecedorService.getAllFornecedores();
			return ResponseEntity.ok(fornecedor);
		}

		@PostMapping("/")
		public ResponseEntity<Fornecedor> insertUsuariosControl(@RequestBody Fornecedor fornecedor) {
			Fornecedor novofornecedor = fornecedorService.saveFornecedor(fornecedor);
			return ResponseEntity.status(HttpStatus.CREATED).body(novofornecedor);
		}
	}
