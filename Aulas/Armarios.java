public class Armarios {

    public static final boolean ABERTO = true;
    public static final boolean FECHADO = false;

    /** Há n armários com estado inicial definido pelo parâmetro.
        Há também n crianças. Para j indo de 1 a n,
        a j-ésima criança entra na sala e modifica o estado
        (aberto <-> fechado) de todos os armários que sejam múltiplos de j.
        O método retorna o número de armários que estarão abertos no final.

        @param n a quantidade de armários e crianças
        @param estadoInicial o estado inicial de todos os armários
        @return a quantidade de armários que estarão abertos ao fim do processo
     **/
    public static int retornarArmariosAbertos(int n, boolean estadoInicial) {

        boolean[] armarios = new boolean[n+1];  // nao usaremos a pos zero
        for (int i = 1; i <= n; i++) {
            armarios[i] = estadoInicial;
        }

        for (int crianca = 1; crianca <= n; crianca++) {
            for (int armario = 1; armario <= n; armario++) {
                if (armario % crianca == 0) {
                    armarios[armario] = !armarios[armario];
                }
            }
        }

        int cont = 0;
        for (int armario = 1; armario <= n; armario++) {
            if (armarios[armario] == ABERTO) {
                cont++;
            }
        }

        return cont;
    }

    public static void main(String[] args) {
        System.out.println("Abertos = " +
            retornarArmariosAbertos(100, FECHADO));
    }
}
