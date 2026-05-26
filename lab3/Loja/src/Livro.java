public class Livro extends Produto {

    private int numeroDePag;

    public Livro(float preco, String descricao, String marca, int paginas) {
        super(preco, descricao, marca);
        this.numeroDePag = paginas;
    }
}
