package test;

import domain.Client;
import jdbc.dao.ClientDAO;
import jdbc.dao.IclientDAO;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private IclientDAO clientDAO;

    @Test
    public void cadastrarTest() throws Exception {
        clientDAO = new ClientDAO();

        Client client = new Client();
        client.setCod("1");
        client.setName("Diego");
        Integer countCad = clientDAO.create(client);
        assertTrue (countCad == 1);

        Client clientBD = clientDAO.findByCod("1");
        assertNotNull(clientBD);
        assertEquals(client.getCod(), clientBD.getCod());
        assertEquals(client.getName(), clientBD.getName());

        Integer countDel = clientDAO.delete(clientBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void buscarTest() throws Exception {
        clientDAO = new ClientDAO();

        Client client = new Client();
        client.setCod("1");
        client.setName("Diego");
        Integer countCad = clientDAO.create(client);
        assertTrue (countCad == 1);

        Client clientBD = clientDAO.findByCod("1");
        assertNotNull(clientBD);
        assertEquals(client.getCod(), clientBD.getCod());
        assertEquals(client.getName(), clientBD.getName());

        Integer countDel = clientDAO.delete(clientBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void deleteTest() throws Exception {
        clientDAO = new ClientDAO();

        Client client = new Client();
        client.setCod("1");
        client.setName("Diego");
        Integer countCad = clientDAO.create(client);
        assertTrue (countCad == 1);

        Client clientBD = clientDAO.findByCod("1");
        assertNotNull(clientBD);
        assertEquals(client.getCod(), clientBD.getCod());
        assertEquals(client.getName(), clientBD.getName());

        Integer countDel = clientDAO.delete(clientBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void findAllTest() throws Exception {
        clientDAO = new ClientDAO();

        Client client = new Client();
        client.setCod("1");
        client.setName("Diego");
        Integer countCad = clientDAO.create(client);
        assertTrue (countCad == 1);

        Client clients = new Client();
        client.setCod("2");
        client.setName("Ingrid");
        Integer countCad2 = clientDAO.create(client);
        assertTrue (countCad2 == 1);

        List<Client> list = clientDAO.findAll();
        assertNotNull(list);
        assertEquals(2, list.size());

        int countDel = 0;
        for (Client cli : list) {
            clientDAO.delete(cli);
            countDel++;
        }
        assertEquals(list.size(), countDel);

        list = clientDAO.findAll();
        assertEquals(list.size(), 0);
    }

    @Test
    public void updateTest() throws Exception {
        clientDAO = new ClientDAO();

        Client client = new Client();
        client.setCod("1");
        client.setName("Diego Apicello");
        Integer countUpdate = clientDAO.create(client);
        assertTrue (countUpdate == 1);

        Client clientBD = clientDAO.findByCod("1");
        assertNotNull(clientBD);
        assertEquals(client.getCod(), clientBD.getCod());
        assertEquals(client.getName(), clientBD.getName());

        client.setCod("2");
        client.setName("Ingrid Oliveira");
        Integer countUpdate2 = clientDAO.create(client);
        assertTrue (countUpdate2 == 1);

        Client clientBD1 = clientDAO.findByCod("2");
        assertNotNull(clientBD1);

        Client clientBD2 = clientDAO.findByCod("2");
        assertNotNull(clientBD2);
        assertEquals(client.getId(), clientBD.getId());
        assertEquals(client.getCod(), clientBD.getCod());
        assertEquals(client.getName(), clientBD.getName());

        List<Client> list = clientDAO.findAll();
        for (Client cli : list) {
            clientDAO.delete(cli);
        }
    }
}
