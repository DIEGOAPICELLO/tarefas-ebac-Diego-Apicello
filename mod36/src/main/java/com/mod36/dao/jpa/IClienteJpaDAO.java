package com.mod36.dao.jpa;

import com.mod36.dao.gereric.jpa.IGenericJpaDAO;
import com.mod36.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJpaDAO<T, Long> {

}
