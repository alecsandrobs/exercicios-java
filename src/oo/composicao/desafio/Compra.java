package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto produto, Double quantidade) {
        this.itens.add(new Item(produto, quantidade));
    }

    void adicionarItem(String nome, Double preco, Double quantidade) {
        Produto produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quantidade));
    }

    Double obterValorTotal() {
        Double total = 0.0;

        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
