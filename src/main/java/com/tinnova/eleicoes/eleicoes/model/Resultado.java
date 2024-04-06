package com.tinnova.eleicoes.eleicoes.model;

import lombok.Data;

@Data
public class Resultado {
  private int totalEleitores;
  private int votosValidos;
  private int votosBrancos;
  private int votosNulos;

  /**
   * Define os resultados das eleições.
   * 
   * @param totalEleitores Total de eleitores.
   * @param votosValidos   Total de votos válidos.
   * @param votosBrancos   Total de votos brancos.
   * @param votosNulos     Total de votos nulos.
   */
  public void setResultados(int totalEleitores, int votosValidos, int votosBrancos, int votosNulos) {
    this.totalEleitores = totalEleitores;
    this.votosValidos = votosValidos;
    this.votosBrancos = votosBrancos;
    this.votosNulos = votosNulos;
  }

  /**
   * Calcula o percentual de votos válidos em relação ao total de eleitores.
   * 
   * @return O percentual de votos válidos.
   */
  public double calcularPercentualVotosValidos() {
    return (double) votosValidos / totalEleitores * 100;
  }

  /**
   * Calcula o percentual de votos brancos em relação ao total de eleitores.
   * 
   * @return O percentual de votos brancos.
   */
  public double calcularPercentualVotosBrancos() {
    return (double) votosBrancos / totalEleitores * 100;
  }

  /**
   * Calcula o percentual de votos nulos em relação ao total de eleitores.
   * 
   * @return O percentual de votos nulos.
   */
  public double calcularPercentualVotosNulos() {
    return (double) votosNulos / totalEleitores * 100;
  }

  /**
   * Autor: Joel Jonas.
   */
}
