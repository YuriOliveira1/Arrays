import java.util.Scanner;

public class Array_12 {
    public static void main(String[] args) {
        // Foram anotadas as idades e alturas de 30 alunos.
        // Faça um Programa que determine quantos alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.

        Scanner input = new Scanner(System.in);

        float[] altura = new float[30];
        int[] idade = new int[30];
        float soma = 0, media;
        int totalDeAlunos = 0;

        for(int i = 0; i < altura.length; i++){
            System.out.print("Altura do aluno(CM): ");
            altura[i] = input.nextFloat();
            soma += altura[i];
            System.out.print("Idade do Alunos: ");
            idade[i] = input.nextInt();
        }
        media = soma / altura.length;
        for (int j = 0; j < altura.length; j++) {
            if (idade[j] >= 13 && altura[j] < media) {
                totalDeAlunos++;
            }
        }
        System.out.println("O total de alunos com mais de 13 anos e possuem a altura menor que "+media+" é de: "+totalDeAlunos);
    }
}
