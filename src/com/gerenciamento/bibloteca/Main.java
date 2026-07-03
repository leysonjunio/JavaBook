package com.gerenciamento.bibloteca;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SenhaAdm senhaDeAdminstracao = new SenhaAdm();

        System.out.println(senhaDeAdminstracao.getSenhaAdm());

        System.out.println("-------------------------------------");
        System.out.println("Bem-vindo ao Portal do Administrador");
        System.out.println("-------------------------------------");
        System.out.println("1 - Adicionar Funcionario");
        System.out.println("2 - Cadastro dos Livros");
        System.out.println("3 - Aluguel do Livro");
        System.out.println("4 - ");
        System.out.println("5 - ");

        byte opcao = scanner.nextByte();
        boolean mainMenu = true;

        scanner.nextLine();

        while (mainMenu) {
            switch (opcao) {
                case 1:
                    System.out.println("Digite a senha:");
                    senhaDeAdminstracao.verificaSenha(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Digite a senha:");
                    int senha = scanner.nextInt();
                    if (senha == ArrayDados.listaDeBibliotecarios.get(4).getSenhaUsuario()) {
                    }
                    break;
                default:
                    mainMenu = false;
                    break;
            }

            ArrayDados.listaDeAtendetes.forEach(System.out::println);
        }
    }
}