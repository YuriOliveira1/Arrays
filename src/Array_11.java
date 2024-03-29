import java.util.Arrays;
import java.util.Scanner;

public class Array_11 {
    public static void main(String[] args) {
        // Altere o programa anterior, intercalando 3 vetores de 10 elementos cada.

        Scanner ler = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];
        int[] vetor4 = new int[30];

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
        for (int i = 0; i < vetor3.length; i++) {
            System.out.print("Coloque elementos no Vetor 3: ");
            vetor3[i] = ler.nextInt();
        }

        // Vetor 4
        int indiceVetor4 = 0;
        for (int i = 0; i < vetor1.length; i++) {
            vetor4[indiceVetor4] = vetor1[i];
            indiceVetor4++;
            vetor4[indiceVetor4] = vetor2[i];
            indiceVetor4++;
            vetor4[indiceVetor4] = vetor3[i];
            indiceVetor4++;
        }
        System.out.println(Arrays.toString(vetor4));
    }
}
