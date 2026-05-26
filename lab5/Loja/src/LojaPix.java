import java.util.ArrayList;

public class LojaPix extends Loja {

    private ArrayList<Vendavel> produtos;
    private Transportadora transportadoraLoja;
    private String metodoDePagamento = "Pix";

    protected boolean receberPagamento(String pagamento){
    	if(pagamento.equals(metodoDePagamento)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public LojaPix(Transportadora transp) {
        this.produtos = new ArrayList<>();
        this.transportadoraLoja = transp;
    }

    public String cadastrarItem(Vendavel item) {
        produtos.add(item);
        return "Produto" + item + " adicionado";
    }

    public String venderItem(String descricaoItem, String formaPag, String enderecoCliente) {
        for (Vendavel prod : produtos) {
            if ((descricaoItem).equals(prod.getDescricao())) {
            	if(receberPagamento(formaPag)) {
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
            	else {
            		return ("Forma de pagamento inválida");
            	}
            }
        }
        return "Essa loja não possui " + descricaoItem;
    }
}
