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

import br.com.AppBarAPI.negocio.Produto;
import br.com.AppBarAPI.service.ProdutoService;

@RestController
@RequestMapping("/api/produto/")
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public List<Produto> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Produto> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Produto Produto) 
	{
		service.incluir(Produto);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}
}