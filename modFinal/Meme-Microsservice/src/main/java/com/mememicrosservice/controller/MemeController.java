package com.mememicrosservice.controller;

import com.mememicrosservice.entity.Meme;
import com.mememicrosservice.service.MemeService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memes")
public class MemeController {


    private static final Logger logger = LoggerFactory.getLogger(MemeController.class);

    @Autowired
    private MemeService memeService;

    @GetMapping
    public List<Meme> findAll(){
        logger.info("GET /memes - Listando todos os memes");
        return memeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Meme> findById(@PathVariable @Valid Long id) {
        logger.info("GET /memes/{} - Buscando meme por ID",(id));
        return memeService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Meme> criar (@RequestBody @Valid Meme meme) {
        logger.info("POST /memes - Criando novo meme? {}", meme.getName());
        Meme salvo = memeService.salvar(meme);
        return ResponseEntity.ok(salvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        logger.info("DELETE /memes/{} - Deletando meme", id);
        memeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
