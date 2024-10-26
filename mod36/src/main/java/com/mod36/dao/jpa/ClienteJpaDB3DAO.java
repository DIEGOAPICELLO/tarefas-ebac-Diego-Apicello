package com.mod36.dao.jpa;

import com.mod36.dao.gereric.jpa.GenericJpaDB3DAO;
import com.mod36.domain.jpa.ClienteJpa2;

public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

    public ClienteJpaDB3DAO() {
        super(ClienteJpa2.class);
    }

}