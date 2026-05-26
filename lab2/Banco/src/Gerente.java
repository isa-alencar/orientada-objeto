import java.util.ArrayList;

class Gerente extends Funcionario {

    ArrayList<Funcionario> subordinados;

    public Gerente(String nome, int cpf, int numeroMatricula, Banco banco) {
        super(nome, cpf, numeroMatricula, banco);
        this.salario = 2 * Banco.salarioBase;
        this.ehGerente = true;
        this.subordinados = new ArrayList<>();
    }

    public void adicionarSubordinado(Funcionario funcionario) {
        if (funcionario.getBanco() != this.bancoOrigem) {
            throw new RuntimeException(
                "Funcionário não pertence ao Banco do gerente!"
            );
        }
        subordinados.add(funcionario);
    }

    public void imprimirEquipe(ArrayList<Funcionario> subordinados) {
        for (Funcionario f : subordinados) {
            System.out.println("Funcionário: " + f.toString());
        }
    }

    @Override
    public String toString() {
        return (super.toString() + String.valueOf(this.subordinados.size()));
    }
}
