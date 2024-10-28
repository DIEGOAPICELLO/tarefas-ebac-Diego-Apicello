package com.mod38.dao;

import com.mod38.dao.generic.IGenericDAO;
import com.mod38.domain.Cliente;

import java.util.List;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

    List<Cliente> filtrarClientes(String query);

}