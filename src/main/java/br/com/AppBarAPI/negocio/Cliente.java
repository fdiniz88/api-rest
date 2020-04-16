package br.com.AppBarAPI.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TCliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "Nome", nullable = false, length = 200)
	private String nome;
	@Column(name = "Idade", nullable = false)
	private long idade;
	@Column(name = "Genero", nullable = false, length = 200)
	private String genero;	
	
	public Cliente() {	
	}

	@Override
	public String toString() {
		return "Cliente -> nome=" + this.getNome() + ", idade=" + this.getIdade() + ", g�nero=" + this.getGenero();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getIdade() {
		return idade;
	}
	public void setIdade(long idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}