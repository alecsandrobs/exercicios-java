package generics;

public class CaixaIntTeste {

    public static void main(String[] args) {
        Caixa caixaA = new CaixaInt();
        caixaA.guardar(123);
        System.out.println(caixaA.abrir());
    }
}
