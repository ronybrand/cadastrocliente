package br.com.brand.rony.spring.boot.crud_cliente.service;

import java.util.List;

import br.com.brand.rony.spring.boot.crud_cliente.domain.Cidade;

public interface CidadeService {

	void salvar(Cidade cidade);
    void atualizar(Cidade cidade);
    void excluir(long cidadeId);
    List<Cidade> recuperarPorEstado(long estadoId);
    List<Cidade> recuperarPorNome(String nomeCidade);

}
