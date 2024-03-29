import java.util.ArrayList;
import java.util.Scanner;

public class Array_08 {
    public static void main(String[] args) {
        // Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor.
        // Imprima a idade e a altura na ordem inversa a ordem lida.

        Scanner ler = new Scanner(System.in);

        int[] idade = new int[5];
        float[] altura = new float[5];
        ArrayList<Integer> listaidade = new ArrayList<Integer>();
        ArrayList<Float> listaaltura = new ArrayList<Float>();

        for (int i = 0; i < idade.length; i++){
            System.out.print("Qual é a idade: ");
            idade[i] = ler.nextInt();
            System.out.print("Qual é a sua altura(Cm): ");
            altura[i] = ler.nextFloat();
        }

        for (int i = idade.length-1; i >= 0; i--) {
            listaidade.add(idade[i]);
            listaaltura.add(altura[i]);
        }

        System.out.println(listaidade);
        System.out.println(listaaltura);
    }
}
