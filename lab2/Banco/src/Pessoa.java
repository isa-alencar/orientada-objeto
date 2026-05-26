public class Pessoa {

    int cpf;
    String nome;

    public Pessoa(int cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " CPF: " + this.cpf;
    }
}
