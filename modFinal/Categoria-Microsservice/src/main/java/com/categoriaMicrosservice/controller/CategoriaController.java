package com.categoriaMicrosservice.controller;

import com.categoriaMicrosservice.entity.CategoriaMeme;
import com.categoriaMicrosservice.service.CategoriaService;
import io.micrometer.core.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private static final Logger logger = LoggerFactory.getLogger(CategoriaController.class);

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    @Timed("categoria_listar")
    public List<CategoriaMeme> findAll(){
        logger.info("GET /catergorias - Listando todas as categorias");
        return categoriaService.findAll();
    }

    @GetMapping ("/{id}")
    @Timed("categoria_findById")
    public ResponseEntity<CategoriaMeme> findById(@PathVariable Long id){
        logger.info("GET /catergorias/{} - Listando categoria por ID", id);
        return categoriaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Timed("categoria_salvar")
    public ResponseEntity<CategoriaMeme> salvar(@RequestBody CategoriaMeme categoriaMeme) {
        logger.info("POST /categorias - Criando nova categoria: {}", categoriaMeme.getName());
        categoriaMeme.setDataCadastro(LocalDate.now());
        CategoriaMeme salva = categoriaService.salvar(categoriaMeme);
        return ResponseEntity.ok(salva);
    }

    @DeleteMapping("/{id}")
    @Timed("Categoria_delete")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        logger.info("DELETE /categorias/{} - Deletando categoria", id);
        categoriaService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
