
import java.util.Scanner;

public class Array_17 {
    public static void main(String[] args) {

        // Em uma competição de salto em distância cada atleta tem direito a cinco saltos.
        // O resultado do atleta será determinado pela média dos cinco valores restantes.
        // Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe o nome, os saltos e a média dos saltos.
        // O programa deve ser encerrado quando não for informado o nome do atleta. A saída do programa deve ser conforme o exemplo abaixo:

        Scanner ler = new Scanner(System.in);

        String nome;

        Float[] notas = new Float[5];
        Float soma = 0.0f, media;

        do {
            System.out.print("Atleta: ");
            nome = ler.nextLine();

            for (int i = 0; i < notas.length; i++){
                System.out.print("Notas: ");
                notas[i] = ler.nextFloat();
                soma += notas[i];
            }
            ler.nextLine();
            media = soma / 5;

            System.out.println("Resultado Final: ");
            System.out.println("Atleta: "+nome);
            System.out.println("Saltos: "+notas[0]+" - "+notas[1]+" - "+notas[2]+" - "+notas[3]+" - "+notas[4]);
            System.out.println("Média: "+media);

            soma = 0.0f;

            for (int i = 0; i < notas.length; i++) {
                notas[i] = null;
            }

        } while (!nome.equals(" "));
    }

}
