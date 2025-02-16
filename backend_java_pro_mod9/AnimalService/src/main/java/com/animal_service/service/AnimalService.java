package com.animal_service.service;

import com.animal_service.entities.Animal;
import com.animal_service.repository.AnimalRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    public Optional<Animal> findById (Long id) {
        return animalRepository.findById(id);
    }

    public Animal saveAnimal (Animal animal) {
        return animalRepository.save(animal);
    }

    public void deleteById(Long id) {
        animalRepository.deleteById(id);
    }

    @Transactional
    public Animal updateAnimal(Long id, Animal animalAtualizado) {
        Animal animalExistente = animalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Animal não encontrado com o ID: " + id));

        // Atualiza os campos fornecidos no JSON
        if (animalAtualizado.getNomeProvisorio() != null) {
            animalExistente.setNomeProvisorio(animalAtualizado.getNomeProvisorio());
        }
        if (animalAtualizado.getIdadeEstimada() != null) {
            animalExistente.setIdadeEstimada(animalAtualizado.getIdadeEstimada());
        }
        if (animalAtualizado.getRaca() != null) {
            animalExistente.setRaca(animalAtualizado.getRaca());
        }
        if (animalAtualizado.getDataEntrada() != null) {
            animalExistente.setDataEntrada(animalAtualizado.getDataEntrada());
        }
        if (animalAtualizado.getCondicoesChegada() != null) {
            animalExistente.setCondicoesChegada(animalAtualizado.getCondicoesChegada());
        }
        if (animalAtualizado.getNomeRecebedor() != null) {
            animalExistente.setNomeRecebedor(animalAtualizado.getNomeRecebedor());
        }
        if (animalAtualizado.getDataObito() != null) {
            animalExistente.setDataObito(animalAtualizado.getDataObito());
        }
        if (animalAtualizado.getPorte() != null) {
            animalExistente.setPorte(animalAtualizado.getPorte());
        }
        if (animalAtualizado.getDataAdocao() != null) {
            animalExistente.setDataAdocao(animalAtualizado.getDataAdocao());
        }

        return animalRepository.save(animalExistente);
    }

}
