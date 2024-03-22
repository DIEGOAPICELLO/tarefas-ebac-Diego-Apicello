package test;

import Service.ClienteService;
import Service.IClienteService;
import dao.IClienteDAO;
import main.Cliente;
import org.junit.Assert;
import org.junit.Test;
import test.dao.ClienteDAOMock;

public class ClienteTest {

    private IClienteService clienteService;
    public ClienteTest(){
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
    }

    @Test
    public void pesquisarCliente(){

        Cliente cliente = new Cliente();

        cliente.setCPF(12312312312L);
        cliente.setName("Diego");
        cliente.setCidade("Cabo Frio");
        cliente.setEnd("Rua Teste");
        cliente.setEstado("RJ");
        cliente.setNumero(1);
        cliente.setTel(229999999L);

        clienteService.salvar(cliente);

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCPF());

        Assert.assertNotNull(clienteConsultado);

    }

}
