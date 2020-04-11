package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = "select * from pessoas";

        Statement st = conexao.createStatement();
        ResultSet rs = st.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

        while (rs.next()) {
            int codigo = rs.getInt("codigo");
            String nome = rs.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        st.close();
        conexao.close();

        for (Pessoa pessoa : pessoas) {
            System.out.println(String.format("%d - %s", pessoa.getCodigo(), pessoa.getNome()));
        }
    }
}
