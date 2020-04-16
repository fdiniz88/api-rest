package br.com.AppBarAPI.negocio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;



@Entity
@Table(name = "TPetisco")
@PrimaryKeyJoinColumn(name = "idProduto")

public class Petisco extends Produto {
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Validade", nullable = false)
	private Date validade;

	@Column(name = "Tipo", length = 100, nullable = false)
	private String tipo;
	@Column(name = "FeitoHoje", nullable = false)
	private boolean isFeitoHoje;	

	public Petisco()	{
		super();
	}


	
	public Petisco(Date validade, String tipo, boolean isFeitoHoje) {
		super();
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

}
