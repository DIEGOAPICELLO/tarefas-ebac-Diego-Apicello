package br.com.mod35.dao;

import br.com.mod35.dao.generic.GenericJpaDAO;
import br.com.mod35.domain.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}