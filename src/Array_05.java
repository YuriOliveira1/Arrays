import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_05 {
    public static void main(String[] args) {
        // Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
        // Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.

        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[20];
        ArrayList<Integer> primos = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero inteiro: ");
            numeros[i] = ler.nextInt();
            if (numeros[i] % 2 == 0) {
                primos.add(numeros[i]);
            } else {
                impares.add(numeros[i]);
            }
        }
        System.out.print("Lista: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(+numeros[i]+", ");
        }
        System.out.println("Numero Primos: "+primos);
        System.out.println("Numeros Impares: "+impares);


    }
}
