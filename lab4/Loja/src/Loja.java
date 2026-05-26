import java.util.ArrayList;

public class Loja {

    ArrayList<Vendavel> produtos;
    Transportadora transportadoraLoja;

    public Loja(Transportadora transp) {
        this.produtos = new ArrayList<>();
        this.transportadoraLoja = transp;
    }

    public String cadastrarItem(Vendavel item) {
        produtos.add(item);
        return "Produto" + item + " adicionado";
    }

    public String venderItem(String descricaoItem, String enderecoCliente) {
        for (Vendavel prod : produtos) {
            if ((descricaoItem).equals(prod.getDescricao())) {
                if (prod instanceof Transportavel) {
                    return transportadoraLoja.transportar(
                        (Transportavel) prod,
                        enderecoCliente
                    );
                } else {
                    return (
                        "O item " + prod.getDescricao() + " foi vendido na loja"
                    );
                }
            }
        }
        return "Essa loja não possui " + descricaoItem;
    }
}
