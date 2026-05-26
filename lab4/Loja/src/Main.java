public class Main {

    public static void main(String[] args) {
        Transportadora isaExpress = new Transportadora("Isa Express");

        Loja minhaLoja = new Loja(isaExpress);

        Produto estante = new Produto(
            110.99f,
            "estante alta para guardar livros",
            "L&L",
            10f
        );

        Produto prateleira = new Produto(
            70.99f,
            "prateleira pequena",
            "L&L",
            2f
        );

        Livro alquimista = new Livro(
            80.99f,
            "um livro de aventura encantador",
            "Paulo Coelho",
            1f,
            208
        );

        Servico consertarEstante = new Servico(100f, "conserta estantes", 6);

        Carro onix = new Carro(106000f, "carro sedan 2026", "Chevrolet", 1060f);

        String enderecoCliente = "Rua Dias da Cruz 113, Méier";

        minhaLoja.cadastrarItem(estante);
        minhaLoja.cadastrarItem(prateleira);
        minhaLoja.cadastrarItem(alquimista);
        minhaLoja.cadastrarItem(consertarEstante);
        minhaLoja.cadastrarItem(onix);

        System.out.println(
            minhaLoja.venderItem("prateleira grande", enderecoCliente)
        );
        System.out.println(
            minhaLoja.venderItem("prateleira pequena", enderecoCliente)
        );
        System.out.println(
            minhaLoja.venderItem(
                "um livro de aventura encantador",
                enderecoCliente
            )
        );
        System.out.println(
            minhaLoja.venderItem("conserta estantes", enderecoCliente)
        );
        System.out.println(
            minhaLoja.venderItem("carro sedan 2026", enderecoCliente)
        );
    }
}
