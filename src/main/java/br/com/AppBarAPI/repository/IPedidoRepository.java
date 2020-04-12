package br.com.AppBarAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.AppBarAPI.negocio.Pedido;

@Repository
public interface IPedidoRepository extends CrudRepository<Pedido, Integer> {

}