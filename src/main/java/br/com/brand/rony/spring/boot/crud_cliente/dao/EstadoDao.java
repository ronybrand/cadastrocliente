package br.com.brand.rony.spring.boot.crud_cliente.dao;

import br.com.brand.rony.spring.boot.crud_cliente.domain.Estado;

public interface EstadoDao {

    void salvar(Estado estado);
    void atualizar(Estado estado);
    void excluir(long estadoId);
}
