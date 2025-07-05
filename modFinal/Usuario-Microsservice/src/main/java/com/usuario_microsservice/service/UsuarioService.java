package com.usuario_microsservice.service;

import com.usuario_microsservice.model.Usuario;
import com.usuario_microsservice.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    public UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario (Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findById (Long id) {
        return usuarioRepository.findById(id);
    }

    public void deleteUser (Long id) {
        usuarioRepository.deleteById(id);
    }



}

