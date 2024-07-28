package jdbc.dao;

import dao.jdbc.ConnectionFactory;
import domain.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class ClientDAO implements IclientDAO{
    @Override
    public Integer create(Client client) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlInsert();
            stm = connection.prepareStatement(stm, client);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw  e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            if ()stm != null && !stm.isClosed()){
                stm.close();
            }

        }
    }

    private String getSqlInsert() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO CLIENT (ID, CODIGO, NOME) ");
        sb.append("VALUES (nextval('SQ_CLIENT') ),? , ?)");
        return sb.toString();
    }

    @Override
    public Integer update(Client client) throws Exception {
        return 0;
    }

    @Override
    public Client findByCod(String cod) throws Exception {
        return null;
    }

    @Override
    public List<Client> findAll() throws Exception {
        return List.of();
    }

    @Override
    public Integer delete(Client client) throws Exception {
        return 0;
    }
}
