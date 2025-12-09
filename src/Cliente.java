public class Cliente {
    private final String nome;
    private final String cidade;
    private final int idade;

    public Cliente(String nome, String cidade, int idade) {
        this.nome = nome;
        this.cidade = cidade;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome=' " + nome + '\'' +
                ", cidade=' " + cidade + '\'' +
                ", idade= " + idade +
                '}';
    }
}