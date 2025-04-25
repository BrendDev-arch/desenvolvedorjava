/*Encapsulamento*/
// public
// private
// protected (Algumas pessoas podem acessar)
// package
// métodos são ações

public class Aluno { // classes são para agrupar

    //variaveis = atributos
    // características
    private String nome; // atrobuto do tipo texto
    private int idade; // atributo do tipo Número
    private boolean temFaculdade; // atributo do tipo Booleano (0 e 1)

    
    
    public Aluno(String nome,int idade,boolean temFaculdade){
        this.nome = nome;
        this.idade = idade;
        this.temFaculdade = temFaculdade;
        
    }
    public String getNome(){ //método para pegar 
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public boolean getTemFaculdade(){
        return temFaculdade;
    }



}