package br.com.brand.rony.spring.boot.crud_cliente.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.brand.rony.spring.boot.crud_cliente.domain.Cliente;
import br.com.brand.rony.spring.boot.crud_cliente.service.ClienteService;

@RestController
@RequestMapping( value = "/cadastrocliente/cliente")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
	public Cliente getClienteById(
			   @PathVariable("id") long id) {
	      return clienteService.recuperarPorId(id);
   }
	

	@RequestMapping(value = { "" , "/" } , method = RequestMethod.GET)
	public List<Cliente> getClienteByNome(String nome) {
	      return clienteService.recuperarPorNome(nome);
   }
	@RequestMapping(value = "/ex/foos", method = RequestMethod.DELETE)
	@ResponseBody
	public String postFoos() {
	    return "d some Foos";
	}
	
	@PostMapping
	public @ResponseBody ResponseEntity < String > salvar(@Valid @RequestBody Cliente cliente) { 
    	clienteService.salvar(cliente);
    	
    	return ResponseEntity.status(HttpStatus.CREATED).build();
    }
	
	@PutMapping
	public @ResponseBody ResponseEntity < String > atualizar(@Valid @RequestBody Cliente cliente) { 
    	clienteService.atualizar(cliente);
    	
    	return new ResponseEntity<String>("Response from PUT method", HttpStatus.OK);
    }

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable("id") Long id) {
    	clienteService.excluir(id);
    }
}
