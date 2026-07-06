package com.gerenciamento.bibloteca;

public class AluguelDeLivro extends Livros {
    private String nomecliente;
    private int telefone;
    private int dataSainda;
    private byte dataRetorno;

    public String getNomecliente() {
        return nomecliente;
    }
    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getDataSainda() {
        return dataSainda;
    }
    public void setDataSainda(int dataSainda) {
        this.dataSainda = dataSainda;
    }

    public int getDataRetorno() {
        return dataRetorno;
    }
    public void setDataRetorno(byte dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String toString(){
        return "Aluguel Cadastrado [Autor: " + this.getNomecliente() + ", Categoria: " + this.getTelefone() + ", Titulo: " + this.getDataSainda() + ", Copias " + this.getDataRetorno() + "]";
    }
}
