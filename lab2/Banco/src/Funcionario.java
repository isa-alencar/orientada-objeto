class Funcionario extends Pessoa {

    protected int matricula;
    protected float salario;
    protected Banco bancoOrigem;
    protected boolean ehGerente;

    public Funcionario(String nome, int cpf, int numeroMatricula, Banco banco) {
        super(cpf, nome);
        this.matricula = numeroMatricula;
        this.salario = Banco.salarioBase;
        this.bancoOrigem = banco;
        this.ehGerente = false;
    }

    public void imprimirContracheque() {
        System.out.println("Salario atual: R$ " + this.salario);
    }

    // getter para pegar o banco origem
    public Banco getBanco() {
        return this.bancoOrigem;
    }

    // getter para pegar a matrícula
    public int getMatricula() {
        return this.matricula;
    }

    // getter para salário
    public float getSalario() {
        return this.salario;
    }

    // setter para novo salário
    public void setSalario(float novoSalario) {
        this.salario = novoSalario;
    }

    @Override
    public String toString() {
        return (
            super.toString() +
            " Matrícula: " +
            this.matricula +
            " Salário: R$" +
            this.salario
        );
    }
}
