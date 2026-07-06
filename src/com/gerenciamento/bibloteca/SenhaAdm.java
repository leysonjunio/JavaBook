package com.gerenciamento.bibloteca;

import java.time.LocalDateTime;
import java.util.Scanner;

public class SenhaAdm {
    Livros newBooks = new Livros();
    Scanner scanner = new Scanner(System.in);
    AddAtendente novoAtendente = new AddAtendente();
    AddBibliotecario novoBibliotecario = new AddBibliotecario();
    Livros newBook = new Livros();

    LocalDateTime timeNow = LocalDateTime.now();
    String numeroDoMes = Integer.toString(timeNow.getMonthValue() + 11);
    String numeroDoDia = Integer.toString(timeNow.getDayOfMonth() + 10);

    private String senhaAdm = numeroDoDia + numeroDoMes;

    public String getSenhaAdm() {
        return senhaAdm;
    }

    public void verificaSenha (String senhaUnica){
        if(senhaUnica.equals(this.senhaAdm)){
            System.out.println("Acesso concedido");
            System.out.println("1 - Adicionar Atendente");
            System.out.println("2 - Adicionar Bibliotecario");
            byte opcao = scanner.nextByte();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Cadastro de Atendente");
                    System.out.println("Digite o Nome: ");
                    novoAtendente.setNome(scanner.nextLine());
                    System.out.println("Digite o Enderenço: ");
                    novoAtendente.setEndereco(scanner.nextLine());
                    System.out.println("Digite o Numero Telefone");
                    novoAtendente.setTelefone(scanner.nextInt());
                    System.out.println("Digite o salario");
                    novoAtendente.setSalario(scanner.nextDouble());

                    System.out.println("Cadastro de Atendente concluido");
                    System.out.println("Nome: " + novoAtendente.getNome());
                    System.out.println("Ederenço: " + novoAtendente.getEndereco());
                    System.out.println("Telefone: " + novoAtendente.getTelefone());
                    System.out.println("Salario: " + novoAtendente.getSalario());
                    Db.listaDeAtendetes.add(novoAtendente);
                    break;
                case 2:
                    System.out.println("Cadastro de Bibliotecario");
                    System.out.println("Digite o Nome: ");
                    novoBibliotecario.setNome(scanner.nextLine());
                    System.out.println("Digite o Enderenço: ");
                    novoBibliotecario.setEndereco(scanner.nextLine());
                    System.out.println("Digite o Numero Telefone");
                    novoBibliotecario.setTelefone(scanner.nextInt());
                    System.out.println("Digite o salario");
                    novoBibliotecario.setSalario(scanner.nextDouble());
                    System.out.println("Digite a Senha Unica");
                    novoBibliotecario.setSenhaUsuario(scanner.nextInt());
                    System.out.println("Cadastro de Bibliotecario concluido");
                    System.out.println("Nome: " + novoBibliotecario.getNome());
                    System.out.println("Ederenço: " + novoBibliotecario.getEndereco());
                    System.out.println("Telefone: " + novoBibliotecario.getTelefone());
                    System.out.println("Salario: " + novoBibliotecario.getSalario());
                    Db.listaDeBibliotecarios.add(novoBibliotecario);
                    break;
                default:
                    System.out.println("Opção incorreta");
                    break;
            }
        }else{
            System.out.println("Acesso Negado");
        }
    }
    public void senhaCadastraLivros(int senha){
        Livros addlivros = new Livros();
        if (senha == Db.listaDeBibliotecarios.get(0).getSenhaUsuario()) {
            System.out.println("Nome do Autor do Livro:");
            addlivros.setAutorDoLivro(scanner.nextLine());
            System.out.println("Titulo do livro:");
            addlivros.setTituloDoLivro(scanner.nextLine());
            System.out.println("Categoria do livro:");
            addlivros.setCategoriaDoLivro(scanner.nextLine());
            System.out.println("Quantas copias são:");
            addlivros.setQtdDoLivro(scanner.nextInt());
            Db.DataBaseConfig.salvarLivro(newBooks.getTituloDoLivro(), newBooks.getCategoriaDoLivro(), newBooks.getQtdDoLivro(), newBooks.getAutorDoLivro());
        }
    }
}

