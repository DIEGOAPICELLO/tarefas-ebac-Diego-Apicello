package com.mod42.ProductMicroservice.ProductMicroService.repositoy;

import com.mod42.ProductMicroservice.ProductMicroService.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
