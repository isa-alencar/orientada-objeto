public class Transportadora {

    String nome;

    public Transportadora(String nome) {
        this.nome = nome;
    }

    public String transportar(Transportavel obj, String endereço) {
        if (obj.getPeso() > 100f) return "Não é transportável, peso alto";
        return "O item será levado até " + endereço;
    }
}
