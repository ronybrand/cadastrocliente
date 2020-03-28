package br.com.brand.rony.spring.boot.crud_cliente.dao;

import java.util.List;

import br.com.brand.rony.spring.boot.crud_cliente.domain.Cidade;

public interface CidadeDao {

    void salvar(Cidade cidade);
    void atualizar(Cidade cidade);
    void excluir(long cidadeId);
    List<Cidade> recuperarPorEstado(String estado);
    List<Cidade> recuperarPorNome(String nomeCidade);
}
