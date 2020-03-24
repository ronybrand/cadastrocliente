package br.com.brand.rony.spring.boot.crud_cliente.service;

import java.util.List;

import br.com.brand.rony.spring.boot.crud_cliente.domain.Cliente;

public interface ClienteService {

	void salvar(Cliente cliente);
    void atualizar(Cliente cliente);
    void excluir(long clienteId);
    Cliente recuperarPorId(long estadoId);
    List<Cliente> recuperarPorNome(String nomeCliente);

}
