package service;

import dao.ClientDao;
import dao.IClientDao;

public class ClientService {

    private IClientDao clientDao;

    public ClientService(IClientDao clientDao){
        this.clientDao = clientDao;
    }

    public String salvar(){
        clientDao.salvar();
        return "Sucesso";
    }

    public String buscar() {
        clientDao.buscar();
        return "Sucesso ao Buscar";
    }
    public String exluir() {
        clientDao.excluir();
        return "Sucesso ao Excluir";
    }
    public String atualizar() {
        clientDao.atualizar();
        return "Sucesso ao Atualizar";
    }
}
