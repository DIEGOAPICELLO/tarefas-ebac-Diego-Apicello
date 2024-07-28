package jdbc.dao;

import domain.Client;

import java.util.List;

public interface IclientDAO {

    public Integer create(Client client) throws Exception;

    public Integer update(Client client) throws Exception;

    public Client findByCod(String cod) throws Exception;

    public List<Client> findAll() throws Exception;

    public Integer delete(Client client) throws Exception;

}