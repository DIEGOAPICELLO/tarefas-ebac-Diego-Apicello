/**
 * 
 */
package br.com.mod35;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.mod35.dao.ClienteDaoMock;
import br.com.mod35.dao.IClienteDAO;
import br.com.mod35.domain.Cliente;
import br.com.mod35.exceptions.DAOException;
import br.com.mod35.exceptions.TipoChaveNaoEncontradaException;
import br.com.mod35.services.ClienteService;
import br.com.mod35.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Diego");
		cliente.setCidade("Cabofrio");
		cliente.setEnd("End");
		cliente.setEstado("RJ");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		
	}
	
	@Test
	public void pesquisarCliente() throws DAOException {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() throws DAOException {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		cliente.setNome("Diego Apicello");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Diego Apicello", cliente.getNome());
	}
}
