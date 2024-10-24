package br.com.mod35.dao;

import br.com.mod35.dao.generic.GenericJpaDAO;
import br.com.mod35.domain.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }
}

