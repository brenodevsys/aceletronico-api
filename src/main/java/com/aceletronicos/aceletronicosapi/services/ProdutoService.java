package com.aceletronicos.aceletronicosapi.services;

import com.aceletronicos.aceletronicosapi.models.Estoque;
import com.aceletronicos.aceletronicosapi.models.Produto;
import com.aceletronicos.aceletronicosapi.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Transactional
    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> procurarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> procurarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    @Transactional
    public void delete(Produto produto){
        produtoRepository.delete(produto);
    }


}
