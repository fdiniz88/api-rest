package br.com.AppBarAPI.negocio;

import java.util.Date;

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
@Table(name = "TPetisco")
@PrimaryKeyJoinColumn(name = "idProduto")

public  class Petisco extends Produto {
	
	private Date validade;
	private String tipo;
	private boolean isFeitoHoje;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProduto", nullable = false)
	@MapsId
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Produto produto;
		
	public Petisco() {
		super();
	}
	
	public Petisco(Date validade, String tipo, boolean isFeitoHoje) {
		this.setValidade(validade);
		this.setTipo(tipo);
		this.setFeitoHoje(isFeitoHoje);
	}
	
	@Override
	public String toString() {
		return "Petisco -> tipo=" + this.getTipo() 
				+ ", validade="	+ this.getValidade() 
				+ ", feito hoje=" + this.isFeitoHoje;
	}	
	
	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isFeitoHoje() {
		return isFeitoHoje;
	}

	public void setFeitoHoje(boolean isFeitoHoje) {
		this.isFeitoHoje = isFeitoHoje;
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
