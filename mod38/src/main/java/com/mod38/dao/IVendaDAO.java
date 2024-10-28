package com.mod38.dao;

import com.mod38.dao.generic.IGenericDAO;
import com.mod38.domain.Venda;
import com.mod38.exceptions.DAOException;
import com.mod38.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public Venda consultarComCollection(Long id);

}