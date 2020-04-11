package streams.desafio;

import streams.utils.Cidadao;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class DesafioFilter {

    public static void main(String[] args) {

        Predicate<Cidadao> idoso = cidadao -> cidadao.getIdade() < 60;
        Predicate<Cidadao> renda = cidadao -> cidadao.getRenda() >= 40000;
        Predicate<Cidadao> imovel = cidadao -> cidadao.isPossuiImovel();
        Function<Cidadao, String> mensagem = cidadao -> String.format("%s, você precisa declarar.", cidadao.getNome());

        cidadaos().stream()
                .filter(renda)
                .filter(idoso)
                .filter(imovel)
                .map(mensagem)
                .forEach(System.out::println);
    }

    private static final List<Cidadao> cidadaos() {
        return asList(
                new Cidadao("Gumercindo Henriques", 60, 15000, true),
                new Cidadao("Clementino Silva", 40, 41234, true),
                new Cidadao("Aurora Souza", 70, 0, false),
                new Cidadao("Derli Carmargo", 55, 102987.88, true),
                new Cidadao("Alberto Roberto", 27, 75432.10, true),
                new Cidadao("Mírian Almeida", 35, 60000, false),
                new Cidadao("Joaquim Venâncio", 18, 23560, true)
        );
    }
}
