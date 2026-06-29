import java.time.LocalDateTime;

public class SenhaAdm {
    AddAtendente novoAtendente = new AddAtendente();
    AddBibliotecario novoBibliotecario = new AddBibliotecario();

    LocalDateTime timeNow = LocalDateTime.now();
    String numeroDoMes = Integer.toString(timeNow.getMonthValue() + 11);
    String numeroDoDia = Integer.toString(timeNow.getDayOfMonth() + 10);

    private String senhaAdm = numeroDoDia + numeroDoMes;

    public String getSenhaAdm() {
        return senhaAdm;
    }

    public void verificaSenha (String senhaUnica){
        if(senhaUnica.equals(this.senhaAdm)){
            System.out.println("Acesso Liberado.");
            System.out.println("Cadastro de Bibliotecario");
            System.out.println("Digite o Nome: ");
            novoAtendente.setNome("João");
            System.out.println("Digite o Enderenço: ");
            novoAtendente.setEndereco("Rua Candido");
            System.out.println("Digite o Numero Telefone");
            novoAtendente.setTelefone(911);
            System.out.println("Digite o salario");
            novoAtendente.setSalario(2500.00);
        }else{
            System.out.println("Acesso Negado");
        }
    }
}

