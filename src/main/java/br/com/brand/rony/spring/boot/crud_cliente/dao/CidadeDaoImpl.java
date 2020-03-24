package br.com.brand.rony.spring.boot.crud_cliente.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.brand.rony.spring.boot.crud_cliente.domain.Cidade;

public class CidadeDaoImpl implements CidadeDao {
	
    @PersistenceContext
    private EntityManager em;

    @Override
    public void salvar(Cidade cidade) {
        em.persist(cidade);
    }

    @Override
    public void atualizar(Cidade cidade) {
        em.merge(cidade);
    }

    @Override
    public void excluir(long cidadeId) {
        em.remove(em.getReference(Cidade.class, cidadeId));
    }
    
    @Override
    public List<Cidade> recuperarPorEstado(long estadoId) {
        return em.createQuery("select c from Cidade c where c.estado.id = :id", Cidade.class)
                .setParameter("id", estadoId)
                .getResultList();
    }
    

    @Override
    public List<Cidade> recuperarPorNome(String nomeCidade) {
        return em.createQuery("select c from Cidade c where c.nome like :nome", Cidade.class)
                .setParameter("nome", nomeCidade)
                .getResultList();
    }
}