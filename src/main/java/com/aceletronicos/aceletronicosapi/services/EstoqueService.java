package com.aceletronicos.aceletronicosapi.services;

import com.aceletronicos.aceletronicosapi.models.Estoque;
import com.aceletronicos.aceletronicosapi.repositories.EstoqueRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EstoqueService {

    final EstoqueRepository estoqueRepository;

    public EstoqueService(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

    public Estoque salvarEstoque(Estoque estoque) {
        return estoqueRepository.save(estoque);
    }

    public List<Estoque> procurarTodos() {
        return estoqueRepository.findAll();
    }

    public Optional<Estoque> procurarPorId(Long id) {
        return estoqueRepository.findById(id);
    }

    @Transactional
    public void delete(Estoque estoque){
        estoqueRepository.delete(estoque);
    }

}
