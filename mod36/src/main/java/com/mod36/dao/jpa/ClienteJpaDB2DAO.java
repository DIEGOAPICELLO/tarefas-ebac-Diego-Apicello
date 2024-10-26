package com.mod36.dao.jpa;

import com.mod36.dao.gereric.jpa.GenericJpaDB2DAO;
import com.mod36.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }

}