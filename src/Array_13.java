import java.util.Scanner;

public class Array_13 {
    public static void main(String[] args) {
        // Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista.
        // Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual,
        // e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).

        Scanner input = new Scanner(System.in);

        String[] meses = {"1 - Janeiro", "2 - Fevereiro", "3 - Março", "4 - Abril", "5 - Maio", "6 - Junho", "7 - Julho", "8 - Agosto", "9 - Setembro", "10 - Outubro", "11 - Novembro", "12 - Dezembro"};
        float[] temperaturas = new float[12];
        float soma = 0;
        float media = 0;
        int totalMesesAcimaDaMedia = 0;

        for (int i = 0; i < meses.length; i++) {
            System.out.print("Digite a temperatura média de cada mês do ano: ");
            temperaturas[i] = input.nextFloat();
            soma += temperaturas[i];
        }

        media = soma / temperaturas.length;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > media) {
                System.out.println("Mês: " + meses[i] + " - Temperatura: " + temperaturas[i]);
            }
        }

    }
}
