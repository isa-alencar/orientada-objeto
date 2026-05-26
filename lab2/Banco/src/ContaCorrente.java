public class ContaCorrente {

    private Pessoa correntista;
    long numeroContaCorrente;
    float saldoEmReais;
    int limiteDoChequeEspecial;

    public ContaCorrente(long numero, Pessoa correntista) {
        this.correntista = correntista;
        this.numeroContaCorrente = numero;
    }
}
