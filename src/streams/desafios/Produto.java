package streams.desafios;

public class Produto {

    public final String nome;
    public final double preco;
    public final double desconto;
    public final double frete;

    public Produto(String nome, double preco, double desconto, double frete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.frete = frete;
    }
}
