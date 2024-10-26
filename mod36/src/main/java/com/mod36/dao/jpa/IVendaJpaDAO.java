package com.mod36.dao.jpa;

import com.mod36.dao.gereric.jpa.IGenericJpaDAO;
import com.mod36.domain.jpa.VendaJpa;
import com.mod36.exceptions.DAOException;
import com.mod36.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJpaDAO<VendaJpa, Long> {

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public VendaJpa consultarComCollection(Long id);
}