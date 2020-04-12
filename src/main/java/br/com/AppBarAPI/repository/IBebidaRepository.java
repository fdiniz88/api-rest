package br.com.AppBarAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.AppBarAPI.negocio.Bebida;


@Repository
public interface IBebidaRepository extends CrudRepository<Bebida, Integer> {

}