package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um nome: ");
        String nome = entrada.nextLine();

        String sql = "INSERT INTO pessoas (nome) VALUES(?)";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, nome);
        ps.execute();

        System.out.println("Pessoa incluída com sucesso!");
        entrada.close();

    }
}
