package br.com.brand.rony.spring.boot.crud_cliente.service;

import java.util.List;

import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brand.rony.spring.boot.crud_cliente.dao.CidadeDao;
import br.com.brand.rony.spring.boot.crud_cliente.domain.Cidade;

@Service
@Transactional
public class CidadeService {

    @Autowired
    private CidadeDao cidadeDao;

    
    public void salvar(Cidade cidade) {
    	cidadeDao.salvar(cidade);
    }
    
    
    public void atualizar(Cidade cidade) {
    	cidadeDao.atualizar(cidade);
    }

    public void excluir(long cidadeId) {
    	cidadeDao.excluir(cidadeId);
    }

	public List<Cidade> recuperarPorEstado(String estado) {
		return cidadeDao.recuperarPorEstado(estado);
	}

	public List<Cidade> recuperarPorNome(String nomeCidade) {
		return cidadeDao.recuperarPorNome(nomeCidade);
	}
}
