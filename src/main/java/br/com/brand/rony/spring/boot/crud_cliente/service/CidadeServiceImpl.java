package br.com.brand.rony.spring.boot.crud_cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brand.rony.spring.boot.crud_cliente.dao.CidadeDao;
import br.com.brand.rony.spring.boot.crud_cliente.domain.Cidade;

@Service
@Transactional
public class CidadeServiceImpl implements CidadeService {

    @Autowired
    private CidadeDao cidadeDao;

    @Override
    public void salvar(Cidade cidade) {
    	cidadeDao.salvar(cidade);
    }
    
    @Override
    public void atualizar(Cidade cidade) {
    	cidadeDao.atualizar(cidade);
    }

    @Override
    public void excluir(long cidadeId) {
    	cidadeDao.excluir(cidadeId);
    }

	@Override
	public List<Cidade> recuperarPorEstado(long estadoId) {
		return cidadeDao.recuperarPorEstado(estadoId);
	}

	@Override
	public List<Cidade> recuperarPorNome(String nomeCidade) {
		return cidadeDao.recuperarPorNome(nomeCidade);
	}
}
