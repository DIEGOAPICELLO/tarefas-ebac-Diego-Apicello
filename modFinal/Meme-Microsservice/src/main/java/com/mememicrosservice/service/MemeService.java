package com.mememicrosservice.service;

import com.mememicrosservice.client.CategoriaClient;
import com.mememicrosservice.client.UserClient;
import com.mememicrosservice.entity.Meme;
import com.mememicrosservice.exception.UsuarioNaoEncontradaException;
import com.mememicrosservice.repository.MemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemeService {

    @Autowired
    private MemeRepository memeRepository;

    @Autowired
    private UserClient userClient;

    @Autowired
    private CategoriaClient categoriaClient;

    public Meme salvar(Meme meme) {
        if (!userClient.userExist(meme.getUserId())) {
            throw new UsuarioNaoEncontradaException("Categoria com ID " + meme.getCategoriaId() + "não encontrado");
        }
        return memeRepository.save(meme);
    }

    public List<Meme> findAll(){
        return memeRepository.findAll();
    }

    public Optional<Meme> findById(Long id) {
        return memeRepository.findById(id);
    }

    public void delete (Long id) {
        memeRepository.deleteById(id);
    }



}
