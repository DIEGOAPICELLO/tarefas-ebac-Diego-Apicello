package com.mod38.service;

import com.mod38.dao.IVendaDAO;
import com.mod38.domain.Venda;
import com.mod38.exceptions.DAOException;
import com.mod38.exceptions.TipoChaveNaoEncontradaException;
import com.mod38.service.generic.GenericService;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class VendaService extends GenericService<Venda, Long> implements IVendaService {

    IVendaDAO dao;

    @Inject
    public VendaService(IVendaDAO dao) {
        super(dao);
        this.dao = dao;
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        venda.setStatus(Venda.Status.CONCLUIDA);
        dao.finalizarVenda(venda);
    }

    @Override
    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        venda.setStatus(Venda.Status.CANCELADA);
        dao.cancelarVenda(venda);
    }

    @Override
    public Venda consultarComCollection(Long id) {
        return dao.consultarComCollection(id);
    }

    @Override
    public Venda cadastrar(Venda entity) throws TipoChaveNaoEncontradaException, DAOException {
        entity.setStatus(Venda.Status.INICIADA);
        return super.cadastrar(entity);
    }



}