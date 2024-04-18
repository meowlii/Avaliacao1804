package com.example.MelissaServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MelissaEntities.Fornecedor;
import com.example.MelissaRepositories.FornecedorRepository;

@Service
public class FornecedorService {
    private final FornecedorRepository fornecedorRepository;

	//construtor que recebe a dependencia
	    
	@Autowired
	public FornecedorService(FornecedorRepository fornecedorRepository) {
	   this.fornecedorRepository = fornecedorRepository;
	}

	public Fornecedor saveFornecedor(Fornecedor fornecedor) {
	   return fornecedorRepository.save(fornecedor);
	}

	public Fornecedor getFornecedorById(Long id) {
	   return fornecedorRepository.findById(id).orElse(null);
	}

	public List<Fornecedor> getAllFornecedores() {
	   return fornecedorRepository.findAll();
	}

	public void deleteFornecedor(Long id) {
	   fornecedorRepository.deleteById(id);
	}
}