package classe;

public class DataTest {

    public static void main(String[] args) {

        Data data1 = new Data();
        data1.dia = 10;
        data1.mes = 9;
        data1.ano = 1987;
        System.out.printf("%d/%d/%d", data1.dia, data1.mes, data1.ano);

        System.out.println();

        Data data2 = new Data(12, 7, 1988);
        System.out.println(data2.dataFormatada());

        new Data(10, 10, 2010).imprimirDataFormatada();

        new Data().imprimirDataFormatada();
    }
}
