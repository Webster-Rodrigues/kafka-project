package io.github.websterrodrigues.icompras.produtos.service;

import io.github.websterrodrigues.icompras.produtos.model.Produto;
import io.github.websterrodrigues.icompras.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }

    public Optional<Produto> obterPorProduto(Long codigo){
        return repository.findById(codigo);
    }




}
