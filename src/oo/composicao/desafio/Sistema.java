package oo.composicao.desafio;

public class Sistema {

    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 1.97, 3.00);
        compra1.adicionarItem(new Produto("Caderno", 14.99), 2.00);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Notebook", 3200.00, 1.00);
        compra2.adicionarItem(new Produto("Impressora", 998.90), 1.00);

        Cliente cliente = new Cliente("Maria Júlia Moraes");
        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);

        System.out.println("=================================================");
        System.out.println(cliente.obterValorTotal());
        System.out.println("=================================================");
    }
}
