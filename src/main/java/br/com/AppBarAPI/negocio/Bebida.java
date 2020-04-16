package br.com.AppBarAPI.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TBebida")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Bebida extends Produto {	

	@Column(name = "Tipo", nullable = false, length = 200)
	private String tipo;
	@Column(name = "Marca", nullable = false, length = 200)
	private String marca;
	@Column(name = "Tamanho", nullable = false)
	private Integer tamanho;
	
	
	public Bebida()	{
		super();
	}

	public Bebida(String tipo, String marca, Integer tamanho) {		
		super();
		this.setTipo(tipo);
		this.setMarca(marca);
		this.setTamanho(tamanho);
	}

	@Override
	public String toString() {
		return "Bebida -> tipo=" + this.getTipo() 
				+ ", marca="	+ this.getMarca() 
				+ ", tamanho=" + this.getTamanho();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}	

}