package test;

import dao.ClienteDAO;
import dao.IClienteDAO;
import main.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.dao.ClienteDAOMock;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;
    private Cliente cliente;

    public ClienteDAOTest () {
        clienteDao = new ClienteDAOMock();
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCPF(12312312312L);
        cliente.setName("Diego");
        cliente.setCidade("Cabo Frio");
        cliente.setEnd("Rua Teste");
        cliente.setEstado("RJ");
        cliente.setNumero(1);
        cliente.setTel(229999999L);
        clienteDao.salvar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.buscarPorCPF(cliente.getCPF());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente(){
        Boolean returno = clienteDao.salvar(cliente);

        Assert.assertTrue(returno);
    }


    @Test
    public void excluirCliente(){
        clienteDao.excluir(cliente.getCPF());
    }

    @Test
    public void alterarCliente(){
        cliente.setName("Diego");
        clienteDao.alterar(cliente);

        Assert.assertEquals("Diego", cliente.getName());
    }
}
