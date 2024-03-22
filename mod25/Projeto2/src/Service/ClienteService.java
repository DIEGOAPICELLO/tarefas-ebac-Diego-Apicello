package Service;

import dao.ClienteDAO;
import dao.IClienteDAO;
import main.Cliente;

public class ClienteService implements IClienteService{
    private IClienteDAO clienteDAO;
    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public void salvar() {

    }

    @Override
    public void salvar(Cliente cliente) {
        clienteDAO.salvar(cliente);

    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.buscarPorCPF(cpf);
    }
}
