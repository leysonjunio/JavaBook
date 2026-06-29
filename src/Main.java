import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SenhaAdm senhaDeAdminstracao = new SenhaAdm();


        LocalDateTime timeNow = LocalDateTime.now();
        int numeroDoMes = timeNow.getMonthValue();
        int numeroDoDia = timeNow.getDayOfMonth();


        System.out.println(senhaDeAdminstracao.getSenhaAdm());

        System.out.println("-------------------------------------");
        System.out.println("Bem-vindo ao Portal do Administrador");
        System.out.println("-------------------------------------");
        System.out.println("1 - Adicionar Atendente");
        System.out.println("2 - Adicionar Bibliotecario");
        System.out.println("3 - Aluguel do Livro");
        System.out.println("4 - ");
        System.out.println("5 - ");

        int opcao = scanner.nextInt();

        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite a senha:");
                senhaDeAdminstracao.verificaSenha(scanner.nextLine());
                break;
            case 2:
               /* System.out.println("Digite o Nome: ");
                novoBibliotecario.setNome("João");
                System.out.println("Digite o Enderenço: ");
                novoBibliotecario.setEndereco("Rua Candido");
                System.out.println("Digite o Numero Telefone");
                novoBibliotecario.setTelefone(911);
                System.out.println("Digite o salario");
                novoBibliotecario.setSalario(2500.00);*/
                break;
            default:
                break;
        }
    }
}