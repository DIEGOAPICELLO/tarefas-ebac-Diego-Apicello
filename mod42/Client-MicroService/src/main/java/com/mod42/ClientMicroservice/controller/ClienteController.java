package com.mod42.ClientMicroservice.controller;

import com.mod42.ClientMicroservice.domain.Cliente;
import com.mod42.ClientMicroservice.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/clientes")
@Tag(name = "Clientes" , description = "Api para gerenciamento de clientes")
public class ClienteController {

    private final ClienteService clienteService;
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    @Operation(summary = "Lista todos os clientes")
    public ResponseEntity<List<Cliente>> listarTodos() {
        return ResponseEntity.ok(clienteService.listarTodos());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Lista um cliente por ID")
    public ResponseEntity<Cliente> findById(@PathVariable Long id) {
        return clienteService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(404).build());
    }

    @PostMapping
    @Operation(summary = "Cria um novo cliente")
    public ResponseEntity<Cliente> criarNovo(@Valid @RequestBody Cliente cliente) {
        return ResponseEntity.status(201).body(clienteService.salvar(cliente));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar um cliente existente")
    public ResponseEntity<Cliente> atualizar (@PathVariable Long id, @Valid @RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.atualizar(id, cliente));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar um cliente")
    public ResponseEntity<Void> deletarCliente (@PathVariable Long id) {
        clienteService.delete(id);
        return ResponseEntity.status(204).build();
    }




}
