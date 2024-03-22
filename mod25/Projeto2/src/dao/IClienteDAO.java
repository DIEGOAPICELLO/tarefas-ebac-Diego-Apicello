package dao;

import main.Cliente;

public interface IClienteDAO {
    void salvar();

    void salvar(Cliente cliente);
    Cliente buscarPorCPF(Long cpf);
}
