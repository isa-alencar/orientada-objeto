public class Main {

    public static void main(String[] args) {
        Transportadora isaExpress = new Transportadora("Isa Express");
        Transportadora pandoraExpress = new Transportadora("Pandora Express");

        Loja minhaLoja = new LojaPix(isaExpress);
        Loja web3Loja = new LojaCripto(pandoraExpress);

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
        
        Produto NFT = new Produto(
                10f,
                "nft anime",
                "Azuki",
                0
            );

        Servico consertarEstante = new Servico(100f, "conserta estantes", 6);

        Carro onix = new Carro(106000f, "carro sedan 2026", "Chevrolet", 1060f);

        String enderecoCliente = "Rua Dias da Cruz 113, Méier";

        minhaLoja.cadastrarItem(estante);
        minhaLoja.cadastrarItem(prateleira);
        minhaLoja.cadastrarItem(alquimista);
        minhaLoja.cadastrarItem(consertarEstante);
        
        web3Loja.cadastrarItem(onix);
        web3Loja.cadastrarItem(NFT);

        System.out.println(
            minhaLoja.venderItem("prateleira grande", "Dinheiro",  enderecoCliente)
        );
        System.out.println(
            minhaLoja.venderItem("prateleira pequena", "Dinheiro", enderecoCliente)
        );
        System.out.println(
            minhaLoja.venderItem(
                "um livro de aventura encantador",
                "Pix",
                enderecoCliente
            )
        );
        System.out.println(
            minhaLoja.venderItem("conserta estantes", "Pix", enderecoCliente)
        );
        System.out.println(
            web3Loja.venderItem("carro sedan 2026", "Criptomoeda", enderecoCliente)
        );
        System.out.println(
                web3Loja.venderItem("nft anime", "Criptomoeda", enderecoCliente)
            );
            
    }
}
