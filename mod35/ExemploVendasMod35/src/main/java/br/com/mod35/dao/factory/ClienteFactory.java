/**
 * 
 */
package br.com.mod35.dao.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.mod35.domain.Cliente;
import br.com.mod35.domain.Sexo;

public class ClienteFactory {

	public static Cliente convert(ResultSet rs) throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setId(rs.getLong("ID_CLIENTE"));
		cliente.setNome(rs.getString(("NOME")));
		cliente.setCpf(rs.getLong(("CPF")));
		cliente.setTel(rs.getLong(("TEL")));
		cliente.setEnd(rs.getString(("ENDERECO")));
		cliente.setNumero(rs.getInt(("NUMERO")));
		cliente.setCidade(rs.getString(("CIDADE")));
		cliente.setEstado(rs.getString(("ESTADO")));
		cliente.setSexo(Sexo.valueOf(rs.getString(("SEXO"))));
		return cliente;
	}
}
