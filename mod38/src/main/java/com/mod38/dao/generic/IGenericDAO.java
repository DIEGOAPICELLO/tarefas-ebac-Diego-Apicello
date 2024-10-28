package com.mod38.dao.generic;

import com.mod38.domain.Persistente;
import com.mod38.exceptions.DAOException;
import com.mod38.exceptions.MaisDeUmRegistroException;
import com.mod38.exceptions.TableException;
import com.mod38.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericDAO <T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException, TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException, MaisDeUmRegistroException, TableException;

    public Collection<T> buscarTodos() throws DAOException;
}