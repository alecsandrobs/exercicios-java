package excessao.personalizada;

@SuppressWarnings("serial")
public class NumeroForaIntervalo extends RuntimeException {

    private String atributo;

    public NumeroForaIntervalo(String atributo) {
        this.atributo = atributo;
    }

    public String getMessage() {
        return String.format("O atributo %s está fora do intervalo", atributo);
    }

}
