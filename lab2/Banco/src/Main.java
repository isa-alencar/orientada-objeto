import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Banco meuBanco = new Banco("Banquinho");
        Pessoa novaPessoa = new Pessoa(00000, "nome");
        Banco meuBanco2 = new Banco("Banco");
        novaPessoa.setNome("Fulaninho");
        novaPessoa.setCPF(543678);
        System.out.println(novaPessoa.toString());

        ContaCorrente deFulaninho = new ContaCorrente(136432L, novaPessoa);

        System.out.println(
            "O banco " +
                meuBanco.getNome() +
                " possui " +
                meuBanco.getNumeroDeContasCorrentes() +
                " contas correntes."
        );

        Funcionario novoFunc1 = new Funcionario(
            "Bela",
            11345654,
            111,
            meuBanco
        );
        Funcionario novoFunc2 = new Funcionario(
            "Pablo",
            11345654,
            112,
            meuBanco
        );
        Funcionario novoFunc3 = new Funcionario(
            "Romeu",
            11345654,
            113,
            meuBanco
        );
        Funcionario novoFunc4 = new Funcionario(
            "Julia",
            11345654,
            211,
            meuBanco2
        );
        Funcionario novoFunc5 = new Funcionario(
            "Larissa",
            11345654,
            211,
            meuBanco2
        );

        ArrayList<Funcionario> equipe = new ArrayList<>();
        equipe.add(novoFunc1);
        System.out.println(novoFunc1.toString());
        equipe.add(novoFunc2);
        System.out.println(novoFunc2.toString());
        equipe.add(novoFunc3);
        System.out.println(novoFunc3.toString());

        Gerente gerente1 = new Gerente("Aline", 435678, 100, meuBanco);
        Gerente gerente2 = new Gerente("Paula", 498567, 200, meuBanco2);

        for (Funcionario f : equipe) {
            gerente1.adicionarSubordinado(f);
        }

        System.out.println(meuBanco.promoverFuncionario(novoFunc1));
        System.out.println(meuBanco2.promoverFuncionario(gerente2));
    }
}
