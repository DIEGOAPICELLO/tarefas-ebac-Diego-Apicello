package jdbc.dao;

import dao.jdbc.ConnectionFactory;
import domain.Client;
import domain.Produt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutDAO implements IprodutoDAO {
    @Override
    public Integer create(Produt produt) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlInsert();
            stm = connection.prepareStatement(sql);
            addParametroInsert(stm, produt);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    private String getSqlInsert() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO PRODUCT (ID, CODIGO, NOME, PRECO) ");
        sb.append("VALUES (nextval('SQ_CLIENT') ),? , ?, ?)");
        return sb.toString();
    }

    private void addParametroInsert(PreparedStatement stm, Produt produt) throws SQLException {
        stm.setString(1, produt.getCod());
        stm.setString(2, produt.getName());
    }

    @Override
    public Integer update(Produt produt) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getsqlUpdate();
            stm = connection.prepareStatement(sql);
            addParametroUpdate(stm, produt);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    private String getsqlUpdate() {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE PRODUCT");
        sb.append("SET NOME = ?, CODIGO = ?, PRECO = ?");
        sb.append("WHERE ID = ?");
        return sb.toString();
    }

    private void addParametroUpdate(PreparedStatement stm, Produt produt) throws SQLException{
        stm.setString(1, produt.getName());
        stm.setString(2, produt.getCod());
        stm.setLong(3, produt.getId());
    }

    @Override
    public Produt findByCod(String cod) throws Exception {
        Connection connection  = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Produt produt = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelect();
            stm = connection.prepareStatement(sql);
            addParametroSelect(stm, cod);
            rs = stm.executeQuery();

            if (rs.next()) {
                produt = new Produt();
                Long id = rs.getLong("ID");
                String nome = rs.getString("NOME");
                String cd = rs.getString("CODIGO");
                double price = rs.getDouble("PRECO");
                produt.setId(id);
                produt.setName(nome);
                produt.setCod(cd);
                produt.setPrice(price);
            }
        }catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return produt;
    }
    private void addParametroSelect(PreparedStatement stm, String cod) throws SQLException{
        stm.setString(1, cod);
    }

    private String getSqlSelect() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM PRODUTCT");
        sb.append("WHERE CODIGO = ?");
        return sb.toString();
    }

    @Override
    public List<Produt> findAll() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Produt> list = new ArrayList<>();
        Produt produt = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelectAll();
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                produt = new Produt();
                Long id = rs.getLong("ID");
                String name = rs.getString("NOME");
                String cd = rs.getString("CODIGO");
                double price = rs.getDouble("PRECO");
                produt.setId(id);
                produt.setName(name);
                produt.setCod(cd);
                produt.setPrice(price);
                list.add(produt);
            }
        } catch (Exception e) {
            throw e;
        }finally {
            closeConnection(connection, stm, rs);
        } return list;
    }
    private String getSqlSelectAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM PRODUCT");
        return sb.toString();
    }

    @Override
    public Integer delete(Produt produt) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlDelete();
            stm = connection.prepareStatement(sql);
            addParametroDelete(stm, produt);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }
    private void addParametroDelete(PreparedStatement stm, Produt produt) throws SQLException {
        stm.setString(1, produt.getCod());
    }

    private String getSqlDelete() {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM PRODUCT");
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