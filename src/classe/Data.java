package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    public Data() {
        this(1, 1, 1970);
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String dataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    public void imprimirDataFormatada() {
        System.out.println(dataFormatada());
    }
}
