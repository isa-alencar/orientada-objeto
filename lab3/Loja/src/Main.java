public class Main {

    public static void main(String[] args) {
        Loja minhaLoja = new Loja();
        Produto estante = new Produto(
            110.99f,
            "estante alta para guardar livros",
            "L&L"
        );
        Produto prateleira = new Produto(70.99f, "prateleira pequena", "L&L");
        Livro alquimista = new Livro(
            80.99f,
            "um livro de aventura encantador",
            "Paulo Coelho",
            208
        );

        minhaLoja.cadastrarProduto(estante);
        minhaLoja.cadastrarProduto(prateleira);
        minhaLoja.cadastrarProduto(alquimista);

        System.out.println(minhaLoja.vender("prateleira pequena"));
        System.out.println(minhaLoja.vender("prateleira grande"));
    }
}
