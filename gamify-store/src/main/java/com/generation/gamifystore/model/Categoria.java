package com.generation.gamifystore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "db_gamifycategoria")
public class Categoria {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message ="O genero do jogo é obrigatório")
		private String genero;
		
		@NotBlank(message = "O tipo de midia deve ser informado")
		private String midia;
		
		@NotNull(message = "Informe a quantidade de jogadores que o jogo aceita")
		private int jogadores;
		
		@NotNull(message = "Informe a classificação indicativa")
		private int idade;
		
		@NotBlank(message = "A língua do jogo deve ser informada")
		private String lingua;
		
		@NotNull(message = "Informe o tamanho de espaço do jogo")
		private int espaco;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getMidia() {
			return midia;
		}

		public void setMidia(String midia) {
			this.midia = midia;
		}

		public int getJogadore() {
			return jogadores;
		}

		public void setJogadore(int jogadore) {
			this.jogadores = jogadore;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getLingua() {
			return lingua;
		}

		public void setLingua(String lingua) {
			this.lingua = lingua;
		}

		public int getEspaco() {
			return espaco;
		}

		public void setEspaco(int espaco) {
			this.espaco = espaco;
		}
}