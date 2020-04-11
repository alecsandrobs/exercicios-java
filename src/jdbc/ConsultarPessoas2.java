package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Pesquisar por: ");
        String nome = entrada.nextLine();

        String sql = "select * from pessoas where nome like ?";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement ps = conexao.prepareStatement(sql);
//        ps.setString(1, String.format("%%s%", nome));
        ps.setString(1, "%" + nome + "%");

        List<Pessoa> pessoas = new ArrayList<>();

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            pessoas.add(new Pessoa(rs.getInt("codigo"), rs.getString("nome")));
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(String.format("%d - %s", pessoa.getCodigo(), pessoa.getNome()));
        }

        ps.close();
        conexao.close();
        entrada.close();
    }

}
