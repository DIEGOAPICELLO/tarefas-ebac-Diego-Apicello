package com.animal_service.repository;

import com.animal_service.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

    Long countByNomeRecebedorAndDataEntradaBetween(String nomeRecebedor, LocalDate startDate, LocalDate endDate);
}
