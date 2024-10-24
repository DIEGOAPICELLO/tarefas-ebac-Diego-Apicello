package br.com.mod35.services.generic;


import br.com.mod35.dao.Persistente;
import br.com.mod35.exceptions.DAOException;
import br.com.mod35.exceptions.MaisDeUmRegistroException;
import br.com.mod35.exceptions.TableException;
import br.com.mod35.exceptions.TipoChaveNaoEncontradaException;
import java.util.Collection;
import java.io.Serializable;

public interface IGenericJpaService <T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException, DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException, TipoChaveNaoEncontradaException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException, MaisDeUmRegistroException, TableException;

    public Collection<T> buscarTodos() throws DAOException;

}