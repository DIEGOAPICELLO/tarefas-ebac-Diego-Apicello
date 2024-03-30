package Service;

import main.Cliente;

public interface IClienteService {

    void salvar();

    Boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);
}
