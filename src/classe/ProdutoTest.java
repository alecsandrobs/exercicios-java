package classe;

public class ProdutoTest {

    public static void main(String[] args) {

        Produto notebook = new Produto();
        notebook.nome = "Notebook";
        notebook.preco = 4356.89;
        Produto.desconto = 0.25;

        Produto caneta = new Produto("Caneta Preta", 12.56);
        Produto.desconto = 0.29;

        double precoFinalNotebook = notebook.precoComDesconto(0.15);
        double precoFinalCaneta = caneta.precoComDesconto();
        double mediaProdutos = (precoFinalNotebook + precoFinalCaneta) / 2;

        System.out.println(notebook.nome + "RS " + precoFinalNotebook);
        System.out.println(caneta.nome + "RS " + precoFinalCaneta);
        System.out.println(String.format("Média dos preços: %.2f", mediaProdutos));
    }
}
