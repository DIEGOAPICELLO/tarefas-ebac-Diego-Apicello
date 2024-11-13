package com.mod42.ClientMicroservice.repository;

import com.mod42.ClientMicroservice.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
