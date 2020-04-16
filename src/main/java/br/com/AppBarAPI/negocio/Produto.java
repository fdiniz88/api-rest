package br.com.AppBarAPI.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Table(name = "TProduto")

  @Inheritance(strategy = InheritanceType.JOINED)  
  @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY,  property = "tipoproduto")  
  @JsonSubTypes({  
  @JsonSubTypes.Type(value = Bebida.class, name = "Bebida"),  
  @JsonSubTypes.Type(value = Petisco.class, name = "Petisco"),  
  @JsonSubTypes.Type(value = Sobremesa.class, name = "Sobremesa") })  
  //@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,  property = "id")
 
public abstract class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	@Column(name = "Descricao", nullable = false, length = 200)
	private String descricao;
	@Column(name = "Preco", nullable = false)
	private Float preco;

	public Produto() {
		
	}

	public Produto(Integer id, String descricao, Float preco) {		
		this();
		this.setId(id);
		this.setDescricao(descricao);
		this.setPreco(preco);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

}
