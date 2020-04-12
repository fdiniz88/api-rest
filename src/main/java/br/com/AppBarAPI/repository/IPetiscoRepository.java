package br.com.AppBarAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.AppBarAPI.negocio.Petisco;

@Repository
public interface IPetiscoRepository extends CrudRepository<Petisco, Integer> {

}