package com.generation.gamifystore.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "db_gamifystore")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message ="O nome do jogo é obrigatório")
	private String nomeDoJogo;
	
	@NotNull(message = "O valor deve ser informado")
	private BigDecimal valor;
	
	@NotNull(message = "A quantidade de itens no estoque deve ser informada")
	private int estoque;
	
	@NotNull(message = "Informe a garantia em meses")
	private int garantia;
	
	@NotBlank(message = "A marca deve ser informada")
	private String marca;
	
	@NotBlank(message = "O contato do fornecedor deve ser informado")
	private String sac;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeDoJogo() {
		return nomeDoJogo;
	}

	public void setNomeDoJogo(String nomeDoJogo) {
		this.nomeDoJogo = nomeDoJogo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSac() {
		return sac;
	}

	public void setSac(String sac) {
		this.sac = sac;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
