import java.util.ArrayList;
import java.util.Scanner;

public class Array_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salarios = new ArrayList<>();

        System.out.println("Digite as vendas brutas de cada vendedor (-1 para encerrar):");
        double vendasBrutas;
        do {
            vendasBrutas = scanner.nextDouble();
            double salario = 200 + (0.09 * vendasBrutas);
            salarios.add(salario);
            vendasBrutas = scanner.nextDouble();
        } while (vendasBrutas != -1);


        int[] contadores = new int[9];
        for (double salario : salarios) {
            int indice = (int) ((salario - 200) / 100);
            if (indice >= 0 && indice < contadores.length) {
                contadores[indice]++;
            }
        }

        for (int i = 0; i < contadores.length; i++) {
            int inicioIntervalo = 200 + i * 100;
            int fimIntervalo = inicioIntervalo + 99;
            System.out.printf("Número de vendedores com salários entre $%d e $%d: %d%n", inicioIntervalo, fimIntervalo, contadores[i]);
        }
    }
}