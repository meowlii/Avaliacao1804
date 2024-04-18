package com.example.MelissaServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MelissaEntities.Cliente;
import com.example.MelissaRepositories.ClienteRepository;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

	//construtor que recebe a dependencia
	    
	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
	   this.clienteRepository = clienteRepository;
	}

	public Cliente saveCliente(Cliente cliente) {
	   return clienteRepository.save(cliente);
	}

	public Cliente getClienteById(Long id) {
	   return clienteRepository.findById(id).orElse(null);
	}

	public List<Cliente> getAllClientees() {
	   return clienteRepository.findAll();
	}

	public void deleteCliente(Long id) {
	   clienteRepository.deleteById(id);
	}
}