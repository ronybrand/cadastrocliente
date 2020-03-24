package br.com.brand.rony.spring.boot.crud_cliente;

import org.glassfish.jersey.server.ResourceConfig;

import br.com.brand.rony.spring.boot.crud_cliente.service.ClienteService;

public class JerseyConfig extends ResourceConfig {

    public JerseyConfig()
    {
        register(ClienteService.class);
    }
}
