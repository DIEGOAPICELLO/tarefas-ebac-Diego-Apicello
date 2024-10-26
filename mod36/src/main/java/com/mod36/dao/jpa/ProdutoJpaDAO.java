package com.mod36.dao.jpa;

import com.mod36.dao.gereric.jpa.GenericJpaDB1DAO;
import com.mod36.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}
