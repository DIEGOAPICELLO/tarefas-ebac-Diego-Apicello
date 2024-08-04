package jdbc.dao;

import domain.Client;
import domain.Produt;

import java.util.List;

public interface IprodutoDAO {

    public Integer create(Produt produt) throws Exception;

    public Integer update(Produt produt) throws Exception;

    public Produt findByCod(String cod) throws Exception;

    public List<Produt> findAll() throws Exception;

    public Integer delete(Produt produt) throws Exception;
}
