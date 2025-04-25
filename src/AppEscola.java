import java.util.Scanner;
import java.util.InputMismatchException;


public class AppEscola { //PascalCasing
    //main
    // public = público
    // static = da classe
    // void = retorno vazio
    // main = principal
    // Static args[] = parÂmetro inicial
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome ?");
        String nome = scanner.nextLine();
        System.out.println("Qual a sua idade ?");
        int idade = scanner.nextInt();
        System.out.println("Tem faculdade ? 0 ou 1");
        boolean temFaculdade = false;
        while (true) {
            try {
                // Primeiro tentamos ler como boolean (true/false)
                temFaculdade = scanner.nextBoolean();
                break;
            } catch (InputMismatchException e) {
                // Se falhar, tentamos ler como número (1/0)
                    int opcao = scanner.nextInt();
                    if (opcao == 1) {
                        temFaculdade = true;
                        break;
                    } else{
                        temFaculdade = false;
                        break;
                    }
            }
        }
        // método principal
        // Classe objeto = new Construtor(parâmetros)
        Aluno aluno = new Aluno(nome,idade,temFaculdade);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getTemFaculdade());



    }
}

