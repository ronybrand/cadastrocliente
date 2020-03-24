package br.com.brand.rony.spring.boot.crud_cliente.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.brand.rony.spring.boot.crud_cliente.domain.Estado;

@Repository
public class EstadoDaoImpl implements EstadoDao {
	
    @PersistenceContext
    private EntityManager em;

    @Override
    public void salvar(Estado estado) {
        em.persist(estado);
    }

    @Override
    public void atualizar(Estado estado) {
        em.merge(estado);
    }

    @Override
    public void excluir(long estadoId) {
        em.remove(em.getReference(Estado.class, estadoId));
    }
}
