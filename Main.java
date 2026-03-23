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
