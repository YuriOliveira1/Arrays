
import java.util.Scanner;
public class Array_01 {
    public static void main(String[] args) {
        // Faça um Programa que leia um vetor de 5 números inteiros e mostre-os

        int[] vet = new int [5];
        Scanner ler = new Scanner(System.in);

        // Lendo e Salvando os elementos dentro do Array
        for (int i = 0; i < vet.length; i++){
        System.out.println("Digite um numero: ");
        vet[i] = ler.nextInt();
        }

        // Imprimindo o array
        for (int i = 0; i < vet.length; i++){
            System.out.print(vet[i]);
        }

     
    }
}
