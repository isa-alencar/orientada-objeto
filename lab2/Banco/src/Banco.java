import java.util.ArrayList;

public class Banco {

    public static final float salarioBase = 5000.0f;
    public static final int TAMANHO_MAX_PRO_NOME = 10;

    private String nome;

    private ArrayList<ContaCorrente> contasCorrentes;

    public Banco(String nome) {
        setNome(nome);
        this.contasCorrentes = new ArrayList<>();
    }

    private ArrayList<Funcionario> time;

    public void adicionarFuncionario(
        String nome,
        int cpf,
        int numeroMatricula,
        Banco banco,
        boolean ehGerente
    ) {
        if (ehGerente == false) {
            Funcionario novo;
            novo = new Funcionario(nome, cpf, numeroMatricula, banco);
            time.add(novo);
        } else {
            Gerente novo;
            novo = new Gerente(nome, cpf, numeroMatricula, banco);
            time.add(novo);
        }
    }

    public Funcionario localizarFuncionario(int matricula) {
        for (Funcionario f : time) {
            if (f.getMatricula() == matricula && f.ehGerente == false) return f;
        }
        return null;
    }

    public Funcionario localizarGerente(int matricula) {
        for (Funcionario g : time) {
            if (g.getMatricula() == matricula && g.ehGerente == true) return g;
        }
        return null;
    }

    public String promoverFuncionario(Funcionario promover) {
        float novoSalario = promover.getSalario() * 1.30f;
        promover.setSalario(novoSalario);
        return (
            "Parabéns " +
            promover.getNome() +
            " você foi promovido" +
            promover.toString()
        );
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        if (novoNome.length() > TAMANHO_MAX_PRO_NOME) {
            return; // o correto seria lançar uma exceção
        }
        this.nome = novoNome;
    }

    public int getNumeroDeContasCorrentes() {
        return contasCorrentes.size();
    }
}
