package test.dao;

import dao.IClienteDAO;
import main.Cliente;

public class ClienteDAOMock implements IClienteDAO {
    @Override
    public void salvar() {

    }

    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCPF(cpf);
        return cliente;
    }
}
