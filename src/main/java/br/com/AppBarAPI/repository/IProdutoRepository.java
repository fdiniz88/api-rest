package br.com.AppBarAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.AppBarAPI.negocio.Produto;

@Repository
public interface IProdutoRepository extends CrudRepository<Produto, Integer> {

}