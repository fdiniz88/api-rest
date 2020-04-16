package br.com.AppBarAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AppBarAPI.negocio.Sobremesa;
import br.com.AppBarAPI.repository.ISobremesaRepository;

@Service
public class SobremesaService {
	
	@Autowired
	ISobremesaRepository repository;

	public List<Sobremesa> obterLista(){
		return (List<Sobremesa>)repository.findAll();
	}
	
	public Optional<Sobremesa> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Sobremesa Sobremesa) {
		repository.save(Sobremesa);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}
