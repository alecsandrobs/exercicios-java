package streamAPI.utils;

public class Aluno {

    public final String nome;
    public final double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return String.format("%s tirou a nota: %s", nota, Util.emValor(nota));
    }
}
