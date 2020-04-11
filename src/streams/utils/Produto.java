package streams.utils;

public class Produto {

    private String nome;
    private double preco;
    private double desconto;
    private double precoFrete;

    public Produto(String nome, double preco, double desconto, double precoFrete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.precoFrete = precoFrete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoFrete() {
        return precoFrete;
    }

    public void setPrecoFrete(double precoFrete) {
        this.precoFrete = precoFrete;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", nome, Util.emReal(preco));
    }
}
