package com.mod38.service;

import com.mod38.domain.Produto;
import com.mod38.service.generic.IGenericService;

import java.util.List;

public interface IProdutoService extends IGenericService<Produto, String> {

    List<Produto> filtrarProdutos(String query);

}