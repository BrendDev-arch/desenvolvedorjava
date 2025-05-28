public class Clinica {

    private String nomeDaClínica;
    private String cnpj;


    public Clinica (){

    }

    public Clinica(String  nomeDaClínica, String cnpj){
        this.nomeDaClínica = nomeDaClínica;
        this.cnpj = cnpj;

    }

    public String getNomeDaClínica() {
        return nomeDaClínica;
    }

    public String getCnpj() {
        return cnpj;
    }

    

}
