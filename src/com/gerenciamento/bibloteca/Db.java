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
            try {
                Class.forName("org.sqlite.JDBC");
            } catch (ClassNotFoundException e) {
                System.out.println("Driver do SQLite não encontrado: " + e.getMessage());
            }
            return DriverManager.getConnection(URL);
        }
        public static void CreateTable_Position(){
            String sql = "CREATE TABLE IF NOT EXISTS AddBibliotecario ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "nome TEXT NOT NULL,"
                    + "endereco TEXT NOT NULL, "
                    + "telefone INTEGER, "
                    + "senhaUnica INTEGER, "
                    + "salario REAL ,"
                    + "funcao CHAR(1));";
            try(Connection conn = connect();
                Statement pstmt = conn.createStatement()){
                pstmt.execute(sql);
                System.out.println("Tabela de livros verificada/criada com sucesso!");
            }catch (SQLException e) {
                System.out.println("Erro ao criar tabela: " + e.getMessage());
            }
        }
        public static void salvePosition(String nome, String endereco, int telefone, int senhaUnica, double salario, char funcao){
            String sql = "INSERT INTO AddBibliotecario (nome, endereco, telefone, senhaUnica, salario, funcao) VALUES(?, ?, ?, ?, ?, ?)";
            try(Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setString(1 , nome);
                pstmt.setString(2, endereco);
                pstmt.setInt(3, telefone);
                pstmt.setInt(4, senhaUnica);
                pstmt.setDouble(5, salario);
                pstmt.setString(6, String.valueOf(funcao));

                pstmt.executeUpdate();
                System.out.println("Funcionario salvo no banco de dados com sucesso!");

            } catch (SQLException e) {
                System.out.println("Erro ao salvar Funcionario: " + e.getMessage());
            }
        }

        public static void createTable_Books() {
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
            String sql = "INSERT INTO livros(titulo, categoria, quantidade, autor) VALUES(?, ?, ?, ?)";
            try (Connection conn = connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)){
                // Substitui as "?" pelos valores reais para evitar erros e ataques (SQL Injection)
                pstmt.setString(1, tituloDolivro);
                pstmt.setString(2, categoriaDoLivro);
                pstmt.setInt(3, qtdDoLivro);
                pstmt.setString(4, autorDoLivro);

                pstmt.executeUpdate();
                System.out.println("Livro salvo no banco de dados com sucesso!");

            } catch (SQLException e) {
                System.out.println("Erro ao salvar livro: " + e.getMessage());
            }
        }
    }
}
