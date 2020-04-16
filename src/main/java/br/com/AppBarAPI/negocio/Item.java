package br.com.AppBarAPI.negocio;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "TItem")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "Descricao", nullable = false, length = 200)
	private String descricao;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)//PERSIST
	@JoinColumn(name = "idPedido")
	@JsonBackReference
	private Pedido pedido;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)//PERSIST
	@JoinColumn(name = "idProduto")	
	private Produto produto;

	public Item() {
	}

	public Item(String descricao, Produto produto, Pedido pedido) {
		this();
		setDescricao(descricao);
		setProduto(produto);
		setPedido(pedido);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}