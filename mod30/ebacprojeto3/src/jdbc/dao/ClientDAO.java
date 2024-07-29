package jdbc.dao;

import dao.jdbc.ConnectionFactory;
import domain.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO implements IclientDAO{
    @Override
    public Integer create(Client client) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlInsert();
            stm = connection.prepareStatement(sql);
            addParametroInsert(stm, client);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw  e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }
    private String getSqlInsert() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO CLIENT (ID, CODIGO, NOME) ");
        sb.append("VALUES (nextval('SQ_CLIENT') ),? , ?)");
        return sb.toString();
    }

    private void addParametroInsert(PreparedStatement stm, Client client) throws SQLException {
        stm.setString(1, client.getCod());
        stm.setString(2, client.getName());

    }

    @Override
    public Integer update(Client client) throws Exception {
       Connection connection = null;
       PreparedStatement stm = null;
       try {
           connection = ConnectionFactory.getConnection();
           String sql = getsqlUpdate();
           stm = connection.prepareStatement(sql);
           addParametroUpdate(stm, client);
           return stm.executeUpdate();
       } catch (Exception e) {
           throw e;
       } finally {
           closeConnection(connection, stm, null);
       }
    }

    private String getsqlUpdate() {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE CLIENT");
        sb.append("SET NOME = ?, CODIGO = ?");
        sb.append("WHERE ID = ?");
        return sb.toString();
    }
    private void addParametroUpdate(PreparedStatement stm, Client client) throws SQLException{
        stm.setString(1, client.getName());
        stm.setString(2, client.getCod());
        stm.setLong(3, client.getId());
    }

    @Override
    public Client findByCod(String cod) throws Exception {
        Connection connection  = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Client client = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelect();
            stm = connection.prepareStatement(sql);
            addParametroSelect(stm, cod);
            rs = stm.executeQuery();

            if (rs.next()) {
                client = new Client();
                Long id = rs.getLong("ID");
                String nome = rs.getString("NOME");
                String cd = rs.getString("CODIGO");
                client.setId(id);
                client.setName(nome);
                client.setCod(cod);
            }
        }catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return client;
    }

    private void addParametroSelect(PreparedStatement stm, String cod) throws SQLException{
        stm.setString(1, cod);

    }

    private String getSqlSelect() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM CLIENT");
        sb.append("WHERE CODIGO = ?");
        return sb.toString();
    }

    @Override
    public List<Client> findAll() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Client> list = new ArrayList<>();
        Client client = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelectAll();
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            
            while (rs.next()) {
                client = new Client();
                Long id = rs.getLong("ID");
                String name = rs.getString("NOME");
                String cd = rs.getString("CODIGO");
                client.setId(id);
                client.setName(name);
                client.setCod(cd);
                list.add(client);
            }
        } catch (Exception e) {
            throw e;
        }finally {
            closeConnection(connection, stm, rs);
        } return list;
    }

    private String getSqlSelectAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM CLIENT");
        return sb.toString();
    }

    @Override
    public Integer delete(Client client) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlDelete();
            stm = connection.prepareStatement(sql);
            addParametroDelete(stm, client);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    private void addParametroDelete(PreparedStatement stm, Client client) throws SQLException {
        stm.setString(1, client.getCod());
    }

    private String getSqlDelete() {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM CLIENT");
        sb.append("WHERE CODIGO = ?");
        return sb.toString();
    }

    private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            if (stm != null && !stm.isClosed()){
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}
