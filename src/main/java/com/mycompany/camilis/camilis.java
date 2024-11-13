/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.camilis;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class camilis {

    public static void main(String[] args) {

        // Parâmetros de conexão
        String url = "jdbc:postgresql://localhost:5432/TrabalhoVendas";
        String user = "postgresql";
        String password = "ca182730";

        // Query SQL
        String query = "SELECT * FROM tbcliente";

        // Tentativa de conexão
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Processamento do ResultSet
            while (rs.next()) {
                // Supondo que você tenha uma coluna chamada 'Nome' em sua tabela 'tbcliente'
                String nome = rs.getString("Nome");
                // E outras colunas que você queira recuperar...
                System.out.println("Cliente: " + nome);
                // Imprima as outras informações conforme necessário
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

