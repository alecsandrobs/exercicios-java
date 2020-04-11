package oo.abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {
        Animal a = new Cachorro();
        System.out.println(a.mover());

        Mamifero m = new Cachorro();
        System.out.println(m.mover());
        System.out.println(m.mamar());
        System.out.println(m.respirar());

        Cachorro c = new Cachorro();
        System.out.println(c.mover());
        System.out.println(c.mamar());
        System.out.println(c.respirar());

    }
}
