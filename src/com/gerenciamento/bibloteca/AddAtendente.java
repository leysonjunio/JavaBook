package com.gerenciamento.bibloteca;

public class AddAtendente extends AddBibliotecario {
    @Override
    public String getNome() {
        return super.getNome();
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getEndereco() {
        return super.getEndereco();
    }
    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco);
    }

    @Override
    public int getTelefone() {
        return super.getTelefone();
    }
    @Override
    public void setTelefone(int telefone) {
        super.setTelefone(telefone);
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }
    @Override
    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public String toString(){
        return "Atendente [Nome: " + this.getNome() + ", Endereço: " + this.getEndereco() + ", telefone: " + this.getTelefone() + ", salario: " + this.getSalario() + "]";
    }
}
