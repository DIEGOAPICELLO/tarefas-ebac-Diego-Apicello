package com.categoriaMicrosservice.service;

import com.categoriaMicrosservice.entity.CategoriaMeme;
import com.categoriaMicrosservice.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaMeme salvar (CategoriaMeme categoriaMeme) {
        return categoriaRepository.save(categoriaMeme);
    }

    public List<CategoriaMeme> findAll() {
        return categoriaRepository.findAll();
    }

    public Optional<CategoriaMeme> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    public void delete (Long id) {
        categoriaRepository.deleteById(id);
    }
}
