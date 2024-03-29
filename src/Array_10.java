import java.util.Arrays;
import java.util.Scanner;

public class Array_10 {
    public static void main(String[] args) {
        // Faça um Programa que leia dois vetores com 10 elementos cada.
        // Gere um terceiro vetor de 20 elementos,
        // cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.

        Scanner ler = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[20];

        // Vetor 1
        for (int i = 0; i < vetor1.length; i++){
            System.out.print("Coloque elementos no Vetor 1: ");
            vetor1[i] = ler.nextInt();
        }

        // Vetor 2
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Coloque elementos no Vetor 2: ");
            vetor2[i] = ler.nextInt();
        }

        // Vetor 3
        int indiceVetor3 = 0;
        for (int i = 0; i < vetor1.length; i++) {
            vetor3[indiceVetor3] = vetor1[i];
            indiceVetor3++;
            vetor3[indiceVetor3] = vetor2[i];
            indiceVetor3++;
        }
        System.out.println(Arrays.toString(vetor3));
    }
}
