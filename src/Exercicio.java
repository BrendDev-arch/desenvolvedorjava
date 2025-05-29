
public class Exercicio {

   private int id;
   private String nomeDoAquecimento;
   private String descricaoDoAquecimento;
   private String somDoAquecimento;
   private int tempoMinDoAquecimento;
   private String exemplo;
   private String nomeDoRelaxamento;
   private String descricaoDoRelaxamento;
   private String somDoRelaxamento;
   private int tempoMinDoRelaxamento;

  

    
    
    // Ctrl+Shift+l
    public Exercicio(){

    }

    public Exercicio(String nomeDoAquecimento, 
     String descricaoDoAquecimento,
     String somDoAquecimento, 
     int tempoMinDoAquecimento
        ){

        this.descricaoDoAquecimento = descricaoDoAquecimento;
        this.nomeDoAquecimento = nomeDoAquecimento;
        this.somDoAquecimento = somDoAquecimento;
        this.tempoMinDoAquecimento = tempoMinDoAquecimento;

    }

    public Exercicio(String exemplo, String nomeDoRelaxamento, String descricaoDoRelaxamento, String somDoRelaxamento, int tempoMinDoRelaxamento ){

        this.exemplo = exemplo;
        this.nomeDoRelaxamento = nomeDoRelaxamento;
        this.descricaoDoRelaxamento = descricaoDoRelaxamento;
        this.somDoRelaxamento = somDoRelaxamento;
        this.tempoMinDoRelaxamento = tempoMinDoRelaxamento;
    
    
    }

    public String getNomeDoAquecimento() {
        return nomeDoAquecimento;
    }

    public String getDescricaoDoAquecimento() {
        return descricaoDoAquecimento;
    }

    public String getSomDoAquecimento() {
        return somDoAquecimento;
    }

    public int getTempoMinDoAquecimento() {
        return tempoMinDoAquecimento;
    }

    public String getExemplo() {
        return exemplo;
    }

    public String getNomeDoRelaxamento() {
        return nomeDoRelaxamento;
    }

    public String getDescricaoDoRelaxamento() {
        return descricaoDoRelaxamento;
    }

    public String getSomDoRelaxamento() {
        return somDoRelaxamento;
    }

    public int getTempoMinDoRelaxamento() {
        return tempoMinDoRelaxamento;
    }


    //métodos de acessos

    


    
}

