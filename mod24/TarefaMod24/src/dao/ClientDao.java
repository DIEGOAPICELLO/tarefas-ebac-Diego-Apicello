package dao;

public class ClientDao implements IClientDao {

    public String salvar(){
        throw new UnsupportedOperationException("Não funciona sem configuração de banco");
    }
    @Override
    public String buscar() {
        throw new UnsupportedOperationException("Não funciona sem configuração de banco");

    }
    @Override
    public String excluir() {
        throw new UnsupportedOperationException("Não funciona sem configuração de banco");
    }
    @Override
    public String atualizar() {
        throw new UnsupportedOperationException("Não funciona sem configuração de banco");
    }
}
