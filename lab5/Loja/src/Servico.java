public class Servico implements Vendavel {

    private float preco;
    private String descricao;
    private int garantia;

    public Servico(float preco, String descricao, int garantia) {
        this.preco = preco;
        this.descricao = descricao;
        this.garantia = garantia;
    }

    public float getPreco() {
        return this.preco;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
