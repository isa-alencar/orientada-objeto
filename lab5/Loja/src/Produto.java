public class Produto implements Vendavel, Transportavel {

    private float preco;
    private String descricao;
    private String marca;
    private float peso;

    public Produto(float preco, String descricao, String marca, float peso) {
        this.preco = preco;
        this.descricao = descricao;
        this.marca = marca;
        this.peso = peso;
    }

    public float getPreco() {
        return this.preco;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public float getPeso() {return this.peso; }
}
