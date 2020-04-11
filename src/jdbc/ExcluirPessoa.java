package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Excluir pessoa: ");
        String nome = entrada.nextLine();

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement ps = conexao.prepareStatement("select * from pessoas where nome like ?");
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();

        int id = 0;
        int contador = 0;
        while (rs.next()) {
            id = rs.getInt("codigo");

            ps = conexao.prepareStatement("delete from pessoas where codigo = ?");
            ps.setInt(1, id);
            contador += ps.executeUpdate();
        }

        System.out.println(String.format("Linhas afetadas: %d", contador));

        ps.close();
        conexao.close();
        entrada.close();
    }
}
