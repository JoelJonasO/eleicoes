package com.tinnova.eleicoes.eleicoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tinnova.eleicoes.eleicoes.model.Resultado;

@SpringBootApplication
public class EleicoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EleicoesApplication.class, args);

		Resultado resultados = new Resultado();

		resultados.setResultados(1000, 800, 150, 50);

		System.out.println("Percentual de votos válidos: " + resultados.calcularPercentualVotosValidos() + "%");
		System.out.println("Percentual de votos brancos: " + resultados.calcularPercentualVotosBrancos() + "%");
		System.out.println("Percentual de votos nulos: " + resultados.calcularPercentualVotosNulos() + "%");
	}

}
