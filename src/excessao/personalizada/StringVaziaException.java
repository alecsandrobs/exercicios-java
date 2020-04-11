package excessao.personalizada;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

    private String atributo;

    public StringVaziaException(String atributo) {
        this.atributo = atributo;
    }

    public String getMessage() {
        return String.format("O atributo %s está vazio", atributo);
    }

}
