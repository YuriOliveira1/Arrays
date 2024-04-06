import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Array_18 {
    public static float porcentagem(int votos, int contadorVotos) {
        return ((float) votos / contadorVotos) * 100;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Enquete: Quem foi o melhor jogador?");
        System.out.println("\n");
        ArrayList<Integer> votosLista = new ArrayList<Integer>();
        Map<Integer, Integer> contagem = new HashMap<>();
        int votos, contadorVotos = 0;

        do {
            System.out.println("Informe o número do jogador (0=fim): ");
            votos = ler.nextInt();
            if (votos != 0 && votos <= 23 && votos > 0) {
                votosLista.add(votos);
                contadorVotos++;
            } else if (votos != 0) {
                System.out.println("Informe um valor entre 1 e 23 ou 0 para sair");
            }
        } while (votos != 0);

        System.out.println("\nResultado da votação:");
        for (int voto : votosLista) {
            if (contagem.containsKey(voto)) {
                contagem.put(voto, contagem.get(voto) + 1);
            } else {
                contagem.put(voto, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
            int jogador = entry.getKey();
            int qtdVotos = entry.getValue();
            float percentual = porcentagem(qtdVotos, contadorVotos);
            System.out.println("Jogador " + jogador + ": " + qtdVotos + " votos (" + percentual + "%)");
        }
    }
}
