package br.com.AppBarAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AppBarAPI.negocio.Pedido;
import br.com.AppBarAPI.repository.IPedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private IPedidoRepository repository;

	public List<Pedido> obterLista(){
		return (List<Pedido>)repository.findAll();
	}
	
	public Optional<Pedido> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Pedido Pedido) {
		repository.save(Pedido);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IPedidoRepository getRepository() {
		return repository;
	}
	public void setRepository(IPedidoRepository repository) {
		this.repository = repository;
	}
}
