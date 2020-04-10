package streamAPI.utils;

public class Cidadao {

    private String nome;
    private int idade;
    private double renda;
    private boolean possuiImovel;

    public Cidadao(String nome, int idade, double renda, boolean possuiImovel) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
        this.possuiImovel = possuiImovel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public boolean isPossuiImovel() {
        return possuiImovel;
    }

    public void setPossuiImovel(boolean possuiImovel) {
        this.possuiImovel = possuiImovel;
    }

    @Override
    public String toString() {
        return nome;
    }
}
