package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Honda;

public class Correr {

    public static void main(String[] args) {
        Carro carro1 = new Honda();

        for (int i = 0; i < 90; i++) {
            carro1.acelerar();
        }

        System.out.println(carro1);

        for (int i = 0; i < 3; i++) {
            carro1.frear();
        }

        System.out.println(carro1);

        Carro carro2 = new Ferrari(400);

        for (int i = 0; i < 70; i++) {
            carro2.acelerar();
        }
        System.out.println(carro2);

        for (int i = 0; i < 3; i++) {
            carro2.frear();
        }

        System.out.println(carro2);
    }
}
