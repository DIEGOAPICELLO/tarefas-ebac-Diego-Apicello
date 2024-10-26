package com.mod36.dao.jpa;

import com.mod36.dao.gereric.jpa.GenericJpaDB1DAO;
import com.mod36.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}