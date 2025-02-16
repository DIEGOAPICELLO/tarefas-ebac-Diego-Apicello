package com.animal_service.controllers;

import com.animal_service.entities.Animal;
import com.animal_service.repository.AnimalRepository;
import com.animal_service.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;
    private AnimalRepository animalRepository;

    @GetMapping
    public List<Animal> getAllAnimals(){
        return animalService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Animal> getAnimalById(@PathVariable Long id) {
        return animalService.findById(id);
    }

    @PostMapping
    public Animal createAnimal (@RequestBody Animal animal) {
        return animalService.saveAnimal(animal);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Animal> updateAnimal(@PathVariable Long id, @RequestBody Animal animalAtualizado) {
        try {
            Animal animal = animalService.updateAnimal(id, animalAtualizado);
            return ResponseEntity.ok(animal);
        } catch (RuntimeException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

    }

    @DeleteMapping("/{id}")
    public void deleteAnimal (@PathVariable Long id){
        animalService.deleteById(id);
    }

    @GetMapping("/count")
    public Long countAnimaisRecebidos(
            @RequestParam String nomeRecebedor,
            @RequestParam LocalDate startDate,
            @RequestParam LocalDate endDate) {
        return animalRepository.countByNomeRecebedorAndDataEntradaBetween(nomeRecebedor, startDate, endDate);
    }
}
