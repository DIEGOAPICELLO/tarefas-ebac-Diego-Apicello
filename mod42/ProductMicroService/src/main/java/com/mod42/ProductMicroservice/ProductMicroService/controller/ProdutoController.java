package com.mod42.ProductMicroservice.ProductMicroService.controller;

import com.mod42.ProductMicroservice.ProductMicroService.domain.Produto;
import com.mod42.ProductMicroservice.ProductMicroService.service.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@Tag(name = "Produtos", description = "API para gerenciamento de produtos")
public class ProdutoController {

    private final ProdutoService producoService;

    public ProdutoController(ProdutoService producoService) {
        this.producoService = producoService;
    }

    @GetMapping
    @Operation(summary = "Lista todos os Produtos")
    public ResponseEntity<List<Produto>> listarTodos() {
        return ResponseEntity.ok(producoService.listarProdutos());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Lista um Produto por ID")
    public ResponseEntity<Produto> findById(@PathVariable Long id) {
        return producoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(404).build());
    }

    @PostMapping
    @Operation(summary = "Cria um novo Produto")
    public ResponseEntity<Produto> criarNovo(@Valid @RequestBody Produto produto) {
        return ResponseEntity.status(201).body(producoService.salvar(produto));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualiza um produto existente")
    public ResponseEntity<Produto> atualizar (@PathVariable Long id, @Valid @RequestBody Produto produto) {
        return ResponseEntity.ok(producoService.atualizar(id, produto));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deleta um Produto")
    public ResponseEntity<Void> deletarProduto (@PathVariable Long id) {
        producoService.deletar(id);
        return ResponseEntity.status(204).build();
    }





}
