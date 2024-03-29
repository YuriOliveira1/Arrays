import java.util.Scanner;

public class Array_07 {
    public static void main(String[] args) {
        // Faça um Programa que leia um vetor de 5 números inteiros,
        // mostre a soma, a multiplicação e os números.

        Scanner ler = new Scanner(System.in);

        int soma = 0, mult = 1;
        int[] numero = new int[5];

        for (int c = 0; c < numero.length; c++){
            System.out.print("Digite um numero: ");
            numero[c] = ler.nextInt();
            soma += numero[c];
            mult *= numero[c];
        }
        for (int c = 0; c < numero.length; c++){
            System.out.print(numero[c]+", ");
        }
        System.out.println(soma);
        System.out.println(mult);
    }
}
