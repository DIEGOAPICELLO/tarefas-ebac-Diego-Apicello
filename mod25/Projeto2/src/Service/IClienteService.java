package Service;

import main.Cliente;

public interface IClienteService {

    void salvar();

    void salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);
}
