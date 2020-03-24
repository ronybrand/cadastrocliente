package br.com.brand.rony.spring.boot.crud_cliente.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brand.rony.spring.boot.crud_cliente.dao.ClienteDao;
import br.com.brand.rony.spring.boot.crud_cliente.domain.Cliente;

@Service
@Transactional
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="cliente")
@Path("/cliente/")
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;
    private static final String CHARSET_UTF8 = ";charset=utf-8";

    @Override
    @POST
    @Consumes({MediaType.APPLICATION_JSON + CHARSET_UTF8})
    public void salvar(Cliente cliente) {
    	clienteDao.salvar(cliente);
    }
    
    @Override
    @PUT
    @Path("/{id}")
    @Consumes({MediaType.APPLICATION_JSON + CHARSET_UTF8})
    public void atualizar(Cliente cliente) {
    	clienteDao.atualizar(cliente);
    }

    @Override
    @DELETE
    @Path("/{id}")
    public void excluir(@PathParam("id") long clienteId) {
    	clienteDao.excluir(clienteId);
    }

	@Override
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    @Transactional(readOnly = true)
	public Cliente recuperarPorId(@PathParam("id") long clienteId) {
		return clienteDao.recuperarPorId(clienteId);
	}

	@Override
	public List<Cliente> recuperarPorNome(@QueryParam("nome") String nomeCliente) {
		return clienteDao.recuperarPorNome(nomeCliente);
	}
}
