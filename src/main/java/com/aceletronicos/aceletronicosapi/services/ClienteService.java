package com.aceletronicos.aceletronicosapi.services;

import com.aceletronicos.aceletronicosapi.models.Cliente;
import com.aceletronicos.aceletronicosapi.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    final ClienteRepository clienteRepository;


    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Transactional
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> procurarTodos() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> procurarPorId(Long id){
        return clienteRepository.findById(id);
    }

    @Transactional
    public void delete(Cliente cliente) {
        clienteRepository.delete(cliente);
    }

}
