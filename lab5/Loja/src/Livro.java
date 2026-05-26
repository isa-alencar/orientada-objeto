public class Livro extends Produto {

    private int numeroDePag;

    public Livro(
        float preco,
        String descricao,
        String marca,
        float peso,
        int paginas
    ) {
        super(preco, descricao, marca, peso);
        this.numeroDePag = paginas;
    }
}
