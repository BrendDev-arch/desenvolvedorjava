public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono!");

        Exercicio ex = new Exercicio();

        ex.nomeDoAquecimento = "Soprar o canudo dentro de um copo com água";
        ex.descricaoDoAquecimento = "Aquecimento da voz";
        ex.tempoMin = 3;
        ex.somDoAqueciemnto = "Sons/som.mp3";
        ex.nomeDoRelaxamento = "Som de animais";
        ex.descricaoDoRelaxamento = "Fazer sons de animais para relaxar o músculo";
        ex.tempoMin = 3;
        ex.somDoRelaxamento = "MiauMiauuuuu";

        Paciente p = new Paciente();

        p.id = 56565333;
        p.email = "lucas@icloud.com";
        p.nome = "Luccas";

        Clinica cl = new Clinica();

        cl.nome = "Fono++";
        cl.cnpj = "36935448000144";
        



    }
}
