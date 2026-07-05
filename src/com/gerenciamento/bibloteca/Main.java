package com.gerenciamento.bibloteca;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        SenhaAdm senhaDeAdminstracao = new SenhaAdm();
        SenhaAdm senhaparaLivros = new SenhaAdm();
        AluguelDeLivro newCliente = new AluguelDeLivro();

        System.out.println(senhaDeAdminstracao.getSenhaAdm());

        int today = time.getDayOfMonth();
        boolean mainMenu = true;
        int bookSpare = 1;

        System.out.println("-------------------------------------");
        System.out.println("Bem-vindo ao Portal do Administrador");
        System.out.println("-------------------------------------");

        while (mainMenu) {
            System.out.println("Menu");
            System.out.println("1 - Adicionar Funcionario");
            System.out.println("2 - Cadastro dos Livros");
            System.out.println("3 - Aluguel do Livro");
            System.out.println("4 - ");
            System.out.println("5 - ");

            int opcao = scanner.nextByte();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a senha:");
                    senhaDeAdminstracao.verificaSenha(scanner.nextLine());
                    continue;
                case 2:
                    System.out.println("Digite a senha:");
                    senhaparaLivros.senhaCadastraLivros(scanner.nextInt());
                    ArrayDados.listBooks.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Digite o Index do cadastro do Livro");
                    int indexBook = scanner.nextInt();
                    scanner.nextLine();
                    if(bookSpare <= ArrayDados.listBooks.get(indexBook).getQtdDoLivro()){
                        System.out.println("Tenho livro disponivel");
                        System.out.println("Informaçoes do Cliente");
                        newCliente.setNomecliente(scanner.nextLine());
                        System.out.println("Infromar o telefone");
                        newCliente.setTelefone(scanner.nextInt());
                        System.out.println("Data Atual");
                        newCliente.setDataSainda(today);
                        System.out.println("data de retorno");
                        newCliente.setDataRetorno(scanner.nextByte());
                    }else{
                        System.out.println("Sem livro no estoque");
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