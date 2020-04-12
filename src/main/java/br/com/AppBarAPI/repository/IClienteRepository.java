package br.com.AppBarAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.AppBarAPI.negocio.Cliente;


@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Integer> {

}