public class Paciente {
    private int id;
    private String nomeDoPaciente;
    private String email;


   public Paciente(){
    
   }

    public void setNomeDoPaciente(String nomeDoPaciente){
        this.nomeDoPaciente = nomeDoPaciente;
    }
    public void setEmail(String email){
        this.email = email;
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
