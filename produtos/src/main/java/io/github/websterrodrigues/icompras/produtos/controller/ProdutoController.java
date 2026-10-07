package io.github.websterrodrigues.icompras.produtos.controller;

import io.github.websterrodrigues.icompras.produtos.model.Produto;
import io.github.websterrodrigues.icompras.produtos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto){
        service.salvar(produto);
        return ResponseEntity.ok(produto);
    }

    @GetMapping("{codigo}")
    public  ResponseEntity<Produto> obterDados(@PathVariable("codigo") Long codigo){
        return service.obterPorProduto(codigo)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}

