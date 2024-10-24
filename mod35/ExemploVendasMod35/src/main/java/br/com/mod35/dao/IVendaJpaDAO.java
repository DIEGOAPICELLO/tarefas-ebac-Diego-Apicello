package br.com.mod35.dao;

import br.com.mod35.dao.generic.IGenericJpaDAO;
import br.com.mod35.domain.VendaJpa;
import br.com.mod35.exceptions.DAOException;
import br.com.mod35.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJpaDAO<VendaJpa, Long> {

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public VendaJpa consultarComCollection(Long id);
}
