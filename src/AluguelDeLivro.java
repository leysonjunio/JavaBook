public class AluguelDeLivro extends Livro{
    private String nomecliente;
    private int telefone;
    private int dataSainda;
    private int dataRetorno;

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
    public void setDataRetorno(int dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    @Override
    public String getCategoriaDoLivro() {
        return super.getCategoriaDoLivro();
    }

    @Override
    public String getTituloDoLivro() {
        return super.getTituloDoLivro();
    }

    @Override
    public int getQtdDoLivro() {
        return super.getQtdDoLivro();
    }

    @Override
    public String getAutorDoLivro() {
        return super.getAutorDoLivro();
    }
}
