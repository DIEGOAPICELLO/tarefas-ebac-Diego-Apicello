package com.categoriaMicrosservice.repository;

import com.categoriaMicrosservice.entity.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaMeme, Long> {
}
