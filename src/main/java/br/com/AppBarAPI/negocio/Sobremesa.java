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
@Table(name = "TSobremesa")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Sobremesa extends Produto {
	
	private Date validade;
	private String tamanho;
	private boolean isFeitoHone;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProduto", nullable = false)
	@MapsId
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Produto produto;
	
	public Sobremesa() {	
		super();
	}
	
	public Sobremesa(Date validade, String tamanho, boolean isFeitoHone) {
		this();
		this.setValidade(validade);
		this.setTamanho(tamanho);
		this.setFeitoHone(isFeitoHone);		
	}
	
	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isFeitoHone() {
		return isFeitoHone;
	}

	public void setFeitoHone(boolean isFeitoHone) {
		this.isFeitoHone = isFeitoHone;
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

	@Override
	public String toString() {
		return "Sobremesa -> tamanho=" + this.getTamanho() 
				+ ", validade="	+ this.getValidade() 
				+ ", feito hoje=" + this.isFeitoHone;
	}
}
