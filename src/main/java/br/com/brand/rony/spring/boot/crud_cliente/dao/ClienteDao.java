package br.com.brand.rony.spring.boot.crud_cliente.dao;

import java.util.List;

import br.com.brand.rony.spring.boot.crud_cliente.domain.Cliente;

public interface ClienteDao {

    void salvar(Cliente cliente);
    void atualizar(Cliente cliente);
    void excluir(long clienteId);
    List<Cliente> recuperarPorNome(String nomeCliente);
    Cliente recuperarPorId(long clienteId);
}
