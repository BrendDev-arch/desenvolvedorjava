public class Paciente {
    protected int id;
    private String nomeDoPaciente;
    private String email;


    public Paciente(){

    }

    public Paciente(String nomeDoPaciente, String email){
        this.nomeDoPaciente = nomeDoPaciente;
        this.email = email;

    }

    public String getNomeDoPaciente() {
        return nomeDoPaciente;
    }

    public String getEmail() {
        return email;
    }

    

}
