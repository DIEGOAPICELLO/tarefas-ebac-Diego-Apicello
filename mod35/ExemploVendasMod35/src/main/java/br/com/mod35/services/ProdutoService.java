/**
 * 
 */
package br.com.mod35.services;

import br.com.mod35.dao.IProdutoDAO;
import br.com.mod35.domain.Produto;
import br.com.mod35.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
