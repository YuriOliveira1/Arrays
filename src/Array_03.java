import java.util.Scanner;

public class Array_03 {
    public static void main(String[] args) {
        // Faça um Programa que leia 4 notas, mostre as notas e a média na tela.

        Scanner ler = new Scanner(System.in);
        int [] vet = new int[4];
        int soma = 0;
        int media;

        // Colocando valores nos vetores
        for (int i = 0; i < 4; i++){
            System.out.print("Nota: ");
            vet[i] = ler.nextInt();
            soma += vet[i];
        }

        // Media
        media = soma / 4;
        System.out.println("A media das notas é: "+media);

        // Imprimindo os Valores Dentro do Array
        System.out.print("Notas Registradas : ");
        for (int i = 0; i < vet.length; i++){
            System.out.print(vet[i]+ ", ");
        }
    }
}
