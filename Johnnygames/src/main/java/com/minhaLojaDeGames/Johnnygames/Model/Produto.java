package com.minhaLojaDeGames.Johnnygames.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	@Entity
	@Table(name = "tb_produto")
	public class Produto {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@NotNull
		@Size (min = 5, max = 50 )
		private String nome;
		@NotNull
		@Size (min = 5, max = 50 )
		private String descricao;
		
		private double preco;
		
		private int quantidade;
		
		private int restricao;
		
		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public int getRestricao() {
			return restricao;
		}

		public void setRestricao(int restricao) {
			this.restricao = restricao;
		}
		
	}