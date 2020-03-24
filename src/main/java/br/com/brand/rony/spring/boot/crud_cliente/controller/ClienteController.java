package br.com.brand.rony.spring.boot.crud_cliente.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/cadastrocliente/cliente" )
public class ClienteController {
	
	@RequestMapping(method = RequestMethod.GET)
   public String getStockItem() {
      return "It's working...!";
   }
}
