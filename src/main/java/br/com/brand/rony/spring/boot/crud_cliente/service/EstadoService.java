package br.com.brand.rony.spring.boot.crud_cliente.service;

import br.com.brand.rony.spring.boot.crud_cliente.domain.Estado;

public interface EstadoService {

    void salvar(Estado estado);
    void atualizar(Estado estado);
    void excluir(long estadoId);

}
