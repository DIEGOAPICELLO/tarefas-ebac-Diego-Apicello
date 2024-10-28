package com.mod38.dao;

import com.mod38.dao.generic.IGenericDAO;
import com.mod38.domain.Produto;

import java.util.List;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

    List<Produto> filtrarProdutos(String query);

}