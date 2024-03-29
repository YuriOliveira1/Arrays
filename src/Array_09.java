import java.util.Scanner;

public class Array_09 {
    public static void main(String[] args) {
        // Faça um Programa que leia um vetor A com 10 números inteiros,
        // calcule e mostre a soma dos quadrados dos elementos do vetor.

        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[10];
        int quadrado = 0;
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = ler.nextInt();
            quadrado = numeros[i] * numeros[i];
            soma += quadrado;
        }

        System.out.println("A soma dos quadrados de todos elementos é: "+soma);
    }
}
