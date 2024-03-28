import java.util.ArrayList;
import java.util.Scanner;

public class Array_06 {
    public static void main(String[] args) {
        // Faça um Programa que peça as quatro notas de 10 alunos,
        // calcule e armazene num vetor a média de cada aluno,
        // imprima o número de alunos com média maior ou igual a 7.0

        Scanner ler = new Scanner(System.in);

        String[] nomes = new String[2];
        float[] notas = new float[4];
        float soma = 0, media;
        ArrayList<Float> mediaAlunos = new ArrayList<Float>();
        ArrayList<String> nomeAlunos = new ArrayList<String>();
        int alunosM7 = 0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do Aluno: ");
            nomes[i] = ler.nextLine();

            for (int j = 0; j < notas.length; j++) {
                System.out.print("Notas: ");
                notas[i] = ler.nextFloat();
                soma += notas[i];
            }

            media = soma / 4;

            if (media > 7.0) {
                alunosM7++;
            }

            mediaAlunos.add(media);
            soma = 0;
            ler.nextLine();
        }
        System.out.println("Lista das media dos 10 Alunos: "+mediaAlunos);
        System.out.println("Existem "+alunosM7+ " Alunos com acima da media 7.0.");
    }
}
