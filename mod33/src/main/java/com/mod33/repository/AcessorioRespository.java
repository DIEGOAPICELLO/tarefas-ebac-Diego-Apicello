package com.mod33.repository;

import com.mod33.model.Acessorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessorioRespository extends JpaRepository<Acessorio, Long> {
}
