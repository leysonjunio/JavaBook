package com.gerenciamento.bibloteca;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {
    public static List<AddAtendente> listaDeAtendetes= new ArrayList<>();
    public static List<AddBibliotecario> listaDeBibliotecarios= new ArrayList<>();
    public static List<Livros> listBooks = new ArrayList<>();
    public static List<AluguelDeLivro> aluguelDosLivros = new ArrayList<>();

    public static class DataBaseConfig{
        private static final String URL = "jdbc:sqlite:biblioteca.db";

        public static Connection connect() throws SQLException {
            return DriverManager.getConnection(URL);
        }
        public static void createTable() {
            String sql = "CREATE TABLE IF NOT EXISTS livros ("
                    + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + " titulo TEXT NOT NULL,"
                    + " categoria TEXT,"
                    + " quantidade INTEGER,"
                    + " autor TEXT);";
            try(Connection conn = connect();
                Statement stmt = conn.createStatement()){
                stmt.execute(sql);
                System.out.println("Tabela de livros verificada/criada com sucesso!");
            }catch (SQLException e) {
                System.out.println("Erro ao criar tabela: " + e.getMessage());
            }
        }
        public static void salvarLivro(String tituloDolivro, String categoriaDoLivro, int qtdDoLivro, String autorDoLivro) {
            String sql = "INSERT INTO livros(tituloDoLivro, catagoriaDoLivro, qtdDolivro, autorDoLivro) VALUES(?, ?, ?, ?)";

            try (Connection conn = connect();
                 PreparedStatement stmt = conn.prepareStatement(sql)){
                // Substitui as "?" pelos valores reais para evitar erros e ataques (SQL Injection)
                stmt.setString(1, tituloDolivro);
                stmt.setString(2, categoriaDoLivro);
                stmt.setInt(3, qtdDoLivro);
                stmt.setString(4, autorDoLivro);

                stmt.executeUpdate();
                System.out.println("Livro salvo no banco de dados com sucesso!");

            } catch (SQLException e) {
                System.out.println("Erro ao salvar livro: " + e.getMessage());
            }
        }
    }
}
