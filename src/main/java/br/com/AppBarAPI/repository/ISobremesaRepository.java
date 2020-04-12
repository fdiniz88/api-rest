package br.com.AppBarAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.AppBarAPI.negocio.Sobremesa;

@Repository
public interface ISobremesaRepository extends CrudRepository<Sobremesa, Integer> {

}