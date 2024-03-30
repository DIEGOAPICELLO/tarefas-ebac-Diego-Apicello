package Service;

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
    public Boolean salvar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }


    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.buscarPorCPF(cpf);
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {



    }
}
