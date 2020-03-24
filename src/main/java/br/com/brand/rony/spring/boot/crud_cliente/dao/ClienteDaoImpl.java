package br.com.brand.rony.spring.boot.crud_cliente.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.brand.rony.spring.boot.crud_cliente.domain.Cliente;

@Repository
public class ClienteDaoImpl implements ClienteDao {
	
    @PersistenceContext
    private EntityManager em;

    @Override
    public void salvar(Cliente cliente) {
        em.persist(cliente);
    }

    @Override
    public void atualizar(Cliente cliente) {
        em.merge(cliente);
    }

    @Override
    public void excluir(long clienteId) {
        em.remove(em.getReference(Cliente.class, clienteId));
    }
    
    @Override
    public Cliente recuperarPorId(long clienteId) {
        return em.find(Cliente.class, clienteId);
    }
    

    @Override
    public List<Cliente> recuperarPorNome(String nomeCliente) {
        return em.createQuery("select c from Cliente c where c.nome like :nome", Cliente.class)
                .setParameter("nome", nomeCliente)
                .getResultList();
    }
}
