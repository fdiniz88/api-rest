package br.com.AppBarAPI.negocio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;



@Entity
@Table(name = "TBebida")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Bebida extends Produto {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProduto", nullable = false)
	@MapsId
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Produto produto;

	private String tipo;
	private String marca;
	private Integer tamanho;
	
	
	public Bebida()	{
		super();
	}

	public Bebida(String tipo, String marca, Integer tamanho) {
			this();
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
	
	public int getIdProduto() {
		return produto.getId();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}