public class Produto implements Vendavel {

    private float preco;
    private String descricao;
    private String marca;

    public Produto(float preco, String descricao, String marca) {
        this.preco = preco;
        this.descricao = descricao;
        this.marca = marca;
    }

    public float getPreco() {
        return this.preco;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
