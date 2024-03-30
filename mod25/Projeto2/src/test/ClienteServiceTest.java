package test;

import Service.ClienteService;
import Service.IClienteService;
import dao.IClienteDAO;
import main.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.dao.ClienteDAOMock;

public class ClienteServiceTest {

    private IClienteService clienteService;
    private Cliente cliente;
    public ClienteServiceTest(){
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
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

        clienteService.salvar(cliente);
    }

    @Test
    public void pesquisarCliente(){

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCPF());

        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente(){
       Boolean returno = clienteService.salvar(cliente);

       Assert.assertTrue(returno);
    }
    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCPF());
    }

    @Test
    public void alterarCliente(){
        cliente.setName("Diego");
        clienteService.alterar(cliente);
        Assert.assertEquals("Diego", cliente.getName());
    }

}
