package excessao.personalizada;

import streams.utils.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {
        Aluno alunoNulo = null;
        Aluno alunoNomeNulo = new Aluno(null, 7);
        Aluno alunoNomeVazio = new Aluno("", 8);
        Aluno alunoNotaNegativa = new Aluno("Joẫo", -9);
        Aluno alunoNotaMaiorQue10 = new Aluno("Pedro", 11);

        Validar.usuario(null);
        Validar.usuario(alunoNomeNulo);
        Validar.usuario(alunoNomeVazio);
        Validar.usuario(alunoNotaNegativa);
        Validar.usuario(alunoNotaMaiorQue10);

        System.out.println("Fim =)");
    }
}
