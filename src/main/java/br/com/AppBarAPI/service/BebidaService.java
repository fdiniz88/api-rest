package br.com.AppBarAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AppBarAPI.negocio.Bebida;
import br.com.AppBarAPI.repository.IBebidaRepository;

@Service
public class BebidaService {
	
	@Autowired
	IBebidaRepository repository;

	public List<Bebida> obterLista(){
		return (List<Bebida>)repository.findAll();
	}
	
	public Optional<Bebida> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Bebida Bebida) {
		repository.save(Bebida);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

}
