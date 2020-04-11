package oo.polimorfismo;

import javax.sound.midi.Soundbank;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Comida arroz = new Arroz(0.200);
        Comida feijao = new Feijao(0.100);

        System.out.println(convidado.getPeso());

        convidado.comer(arroz);
        convidado.comer(feijao);

        System.out.println(convidado.getPeso());

        Comida sobremesa = new Sorvete(0.400);

        convidado.comer(sobremesa);

        System.out.println(convidado.getPeso());


    }
}
