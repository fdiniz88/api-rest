package br.com.AppBarAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AppBarAPI.negocio.Cliente;
import br.com.AppBarAPI.repository.IClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private IClienteRepository repository;

	public List<Cliente> obterLista(){
		return (List<Cliente>)repository.findAll();
	}
	
	public Optional<Cliente> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Cliente Cliente) {
		repository.save(Cliente);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IClienteRepository getRepository() {
		return repository;
	}
	public void setRepository(IClienteRepository repository) {
		this.repository = repository;
	}
}
