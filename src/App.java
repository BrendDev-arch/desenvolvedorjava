public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono!");

        Exercicio ex = new Exercicio("Soprar o canudo dentro de um copo com água", "Aquecimento da voz", "som.mp3", 3); // CTRL+SPACE


        Exercicio ex1 = new Exercicio("Kiko", "Som de animais", "Fazer sons de animais para relaxar o músculo", "MiauMiauuuuu", 3);

        System.out.println("Nome do Aquecimento: " + ex.getNomeDoAquecimento());
        System.out.println("Descrição do Aquecimento: " + ex.getDescricaoDoAquecimento());
        System.out.println("Som do Aquecimento: " + ex.getSomDoAquecimento());
        System.out.println("Tempo Mínimo do Aquecimento: " + ex.getTempoMinDoAquecimento());
        System.out.println("Exemplo: " + ex1.getExemplo());
        System.out.println("Nome do relaxamento: " + ex1.getNomeDoRelaxamento());
        System.out.println("Nome da descrição do relaxamento: " + ex1.getDescricaoDoRelaxamento());
        System.out.println("Som do relaxamento: " + ex1.getSomDoRelaxamento());  
        System.out.println("Tempo Mínimo do Relaxamento: " + ex1.getTempoMinDoRelaxamento());
    
    
    
        Paciente p = new Paciente("Luccas", "lucas@hotmail.com");

        System.out.println("Nome do Paciente: " + p.getNomeDoPaciente());
        System.out.println("Email do paciente: " + p.getEmail());

     

        Clinica cl = new Clinica( "Fono++", "36935448000144");

        System.out.println("Nome da Clínica: " + cl.getNomeDaClínica());
        System.out.println("Cnpj da Clínica: " + cl.getCnpj() );

    
        



    }
}
