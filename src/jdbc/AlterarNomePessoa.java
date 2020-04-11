package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um nome para atualizar: ");
        String nome = entrada.nextLine();

        String sql = "select * from pessoas where nome like ?";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        int id = 0;
        while (rs.next()) {
            id = rs.getInt("codigo");

            System.out.print(String.format("Substitua '%s' por: ", rs.getString("nome")));
            nome = entrada.nextLine();

            sql = "update pessoas set nome = ? where codigo = ?";

            ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
        }

        ps.close();
        conexao.close();
        entrada.close();
    }
}
