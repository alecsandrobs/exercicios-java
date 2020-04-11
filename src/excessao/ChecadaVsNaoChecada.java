package excessao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }

    // Excessão não checada ou não verificada
    static void geraErro1() {
        throw new RuntimeException("Ocorreu o erro #01");
    }

    // Excessão checada ou verificada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu o erro #02");
    }
}
