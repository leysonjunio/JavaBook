package com.gerenciamento.bibloteca;

public class AddBibliotecario{
    private String nome;
    private String endereco;
    private int telefone;
    private int senhaUsuario;
    private double salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getSenhaUsuario(){return senhaUsuario;}
    public void setSenhaUsuario(int senhaUsuario){this.senhaUsuario = senhaUsuario;}

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {this.salario = salario;}

    public static class Gerenciamento extends Livros {
        @Override
        public String getTituloDoLivro() {
            return super.getTituloDoLivro();
        }
        @Override
        public void setTituloDoLivro(String tituloDoLivro) {
            super.setTituloDoLivro(tituloDoLivro);
        }

        @Override
        public String getCategoriaDoLivro() {
            return super.getCategoriaDoLivro();
        }
        @Override
        public void setCategoriaDoLivro(String categoriaDoLivro) {
            super.setCategoriaDoLivro(categoriaDoLivro);
        }

        @Override
        public int getQtdDoLivro() {
            return super.getQtdDoLivro();
        }
        @Override
        public void setQtdDoLivro(int qtdDoLivro) {
            super.setQtdDoLivro(qtdDoLivro);
        }

        @Override
        public String getAutorDoLivro() {
            return super.getAutorDoLivro();
        }
        @Override
        public void setAutorDoLivro(String autorDoLivro) {
            super.setAutorDoLivro(autorDoLivro);
        }
    }

    public String toString(){
        return "Bibliotecario [Nome: " + this.getNome() + ", Endereço: " + this.getEndereco() + ", telefone: " + this.getTelefone() + ", salario: " + this.getSalario() + ", senha unica: " + this.getSenhaUsuario() + "]";
    }
}
