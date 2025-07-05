package com.usuario_microsservice.controller;

import com.usuario_microsservice.model.Usuario;
import com.usuario_microsservice.service.UsuarioService;
import io.micrometer.core.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    @Timed(value = "usuarios.listar", description = "Tempo gasto para listar usuarios")
    public List<Usuario> findAll () {
        logger.info("Requisição recebida para listar usuarios");
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    @Timed(value = "usuarios.buscarPorId", description = "Tempo gasto para buscar usuários por ID")
    public ResponseEntity<Usuario> findById (@PathVariable Long id) {
        logger.info("Buscando usuario por ID: {}", id);
        return usuarioService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> {
                    logger.warn("Usuario com ID: {} não encontrado", id);
                    return ResponseEntity.notFound().build();
                });
    }

    @PostMapping
    @Timed(value = "usuarios.salvar", description = "Tempo gasto para salvar usupario")
    public ResponseEntity<Usuario> savarUsuario (@Validated @RequestBody Usuario user) {
        logger.info("Salvando novo usuário: {}", user.getEmail());
        user.setDataCadastro(LocalDate.now());
        Usuario userSalvo = usuarioService.salvarUsuario(user);
        return ResponseEntity.ok(userSalvo);
    }

    public ResponseEntity<Void> deleteUser (@PathVariable Long id) {
        logger.info("Deletando usuário com ID: {}", id);
        usuarioService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }






}
