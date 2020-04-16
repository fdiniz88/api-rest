package br.com.AppBarAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.AppBarAPI.negocio.Bebida;
import br.com.AppBarAPI.service.BebidaService;

@RestController
@RequestMapping("/api/bebida/")
public class BebidaController {

	@Autowired
	private BebidaService service;
	
	@GetMapping
	public List<Bebida> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Bebida> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Bebida Bebida) {
		service.incluir(Bebida);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}
	
}