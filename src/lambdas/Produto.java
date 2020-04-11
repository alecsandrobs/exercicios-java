package lambdas;

public class Produto extends Object {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    double precoFinal() {
        return this.preco * (1 - this.desconto);
        /*if (desconto > 0.0) {
            return preco * (1 - desconto);
        } else {
            return preco;
        }*/
    }

    @Override
    public String toString() {
        return String.format("%s, preço final %.2f", nome, precoFinal());
    }
}
