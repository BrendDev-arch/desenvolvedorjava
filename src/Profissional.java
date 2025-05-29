public class Profissional {
    private int id;
    private String nomeDoProfissional;
    private int telefone;


    public Profissional (){

    }

    public void setNomeDoProfissional(String nomeDoProfissional){
        this.nomeDoProfissional = nomeDoProfissional;

    }

    public void setTelefone(int telefone){
        this.telefone = telefone;

    }

    public Profissional(String nomeDoProfissional, int telefone){
        this.nomeDoProfissional = nomeDoProfissional;
        this.telefone = telefone;

    }

    public String getNomeDoProfissional(){
        return nomeDoProfissional;
    }

    public int getTelefone(){
        return telefone;
    }
}

