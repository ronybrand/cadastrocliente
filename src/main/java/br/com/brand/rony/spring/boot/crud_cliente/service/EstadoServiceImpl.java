package br.com.brand.rony.spring.boot.crud_cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brand.rony.spring.boot.crud_cliente.dao.EstadoDao;
import br.com.brand.rony.spring.boot.crud_cliente.domain.Estado;

@Service
@Transactional
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    private EstadoDao estadoDao;

    @Override
    public void salvar(Estado estado) {
        estadoDao.salvar(estado);
    }
    
    @Override
    public void atualizar(Estado estado) {
        estadoDao.atualizar(estado);
    }

    @Override
    public void excluir(long estadoId) {
    	estadoDao.excluir(estadoId);
    }
}
