/**
 * 
 */
package br.com.mod35.dao;

import br.com.mod35.dao.generic.IGenericDAO;
import br.com.mod35.domain.Venda;
import br.com.mod35.exceptions.DAOException;
import br.com.mod35.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
