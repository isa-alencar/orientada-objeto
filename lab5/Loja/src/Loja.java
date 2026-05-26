import java.util.ArrayList;

abstract class Loja {

    protected ArrayList <Vendavel> produtos;
    protected Transportadora transportadoraLoja;

    abstract protected boolean receberPagamento(String formaPagamento);
    abstract String cadastrarItem(Vendavel item);
    abstract String venderItem(String descricaoItem, String formaPagamento, String enderecoCliente);
}
