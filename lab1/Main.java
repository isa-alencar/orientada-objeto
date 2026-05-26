/* 
  Programa que declara frações e realiza diversas operações com elas.
  Tarefa inicial da disciplina para treinar conceitos básicos.
  Abaixo estão as classes e as operações possíveis de realizar com seus métodos:
    - Classe Fracao: cria, imprime, calcula o valor numérico de uma fração e encontra a fração irredutível correspondente da fração recebida.
    - Classe Aritmetica: classe funcional que contém o cálculo do mdc implementado. */

public class Main{
  public static void main(String[] args){
    int num = -10;
    int den = 2;

    Fracao primeiraFracao = new Fracao(num, den);
    System.out.println("Fração: " + primeiraFracao.toString());

    Fracao irredutivel = primeiraFracao.getFracaoIrredutivel();
    System.out.println("Forma irredutível: " + irredutivel.toString());
    
    System.out.println("Resultado da fração: " + primeiraFracao.getValorNumerico());
  }
}
