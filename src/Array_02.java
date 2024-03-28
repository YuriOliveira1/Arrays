import java.util.Scanner;

public class Array_02 {
    public static void main(String[] args) {
        // Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.

        int[] vet = new int[10];
        Scanner ler = new Scanner(System.in);

        // Lendo e salvando os elemento no array
        for (int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero:");
            vet[i] = ler.nextInt();
        }

        // Imprimindo o array na ordem inversa
        for (int i = vet.length-1; i >= 0; i--){
            System.out.print(vet[i]);
        }
    }
}
