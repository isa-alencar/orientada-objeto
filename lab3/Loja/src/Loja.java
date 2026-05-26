import java.util.ArrayList;

public class Loja {

    ArrayList<Produto> produtos;
    ArrayList<Servico> servicos;

    public Loja() {
        this.produtos = new ArrayList<>();
        this.servicos = new ArrayList<>();
    }

    public String cadastrarProduto(Produto novoProduto) {
        produtos.add(novoProduto);
        return "Produto" + novoProduto + " adicionado";
    }

    public String vender(String descricaoProduto) {
        for (Produto prod : produtos) {
            if (descricaoProduto.equals(prod.getDescricao())) {
                return "O produto " + prod.getDescricao() + " foi vendido";
            }
        }
        return "Essa loja não possui esse produto";
    }

    public String cadastrarServico(Servico novoServico) {
        servicos.add(novoServico);
        return "Serviço" + novoServico + " adicionado";
    }

    public String servico(String descricaoServico) {
        for (Servico serv : servicos) {
            if (descricaoServico.equals(serv.getDescricao())) {
                return "O serviço " + serv + " foi vendido";
            }
        }
        return "Essa loja não possui esse serviço";
    }
}
