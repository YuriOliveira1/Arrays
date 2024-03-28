
import java.util.Arrays;
import java.util.Scanner;

public class Array_04 {
    public static void main(String[] args) {
        // Faça um Programa que leia um vetor de 10 caracteres,
        // e diga quantas consoantes foram lidas. Imprima as consoantes.
        // Consoantes: B, C, D, F, G, J, K, L, P, Q, R, S, T, V, W, X, Z

        Scanner ler = new Scanner(System.in);
        int numeroConsoantes = 0;
        String[] vet = new String[10];
        String[] consoantes = {"B", "C", "D", "F", "G", "J", "K", "L", "P", "Q", "R", "S", "T", "V", "W", "X", "Z"};

        for (int i = 0; i < vet.length; i++){
            System.out.print("Caracteres(Maiusculo): ");
            vet[i] = ler.nextLine();
            if (Arrays.asList(consoantes).contains(vet[i])){
                numeroConsoantes++;
                System.out.println("é uma consoante: "+ vet[i]);
            }

        }
        System.out.println("Foram lidas: "+numeroConsoantes+" consoantes");
    }
}
