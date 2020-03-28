package br.com.brand.rony.spring.boot.crud_cliente.service;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brand.rony.spring.boot.crud_cliente.dao.ClienteDao;
import br.com.brand.rony.spring.boot.crud_cliente.domain.Cliente;

@Service
@Transactional
public class ClienteService {

    @Autowired
    private ClienteDao clienteDao;

    public void salvar(Cliente cliente) {
    	clienteDao.salvar(cliente);
    }
    
    public void atualizar(Cliente cliente) {
    	clienteDao.atualizar(cliente);
    }

    public void excluir(@PathParam("id") long clienteId) {
    	clienteDao.excluir(clienteId);
    }

    @Transactional(readOnly = true)
	public Cliente recuperarPorId(@PathParam("id") long clienteId) {
		return clienteDao.recuperarPorId(clienteId);
	}

	public List<Cliente> recuperarPorNome(String nomeCliente) {
		return clienteDao.recuperarPorNome(nomeCliente);
	}
}
