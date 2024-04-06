import java.util.ArrayList;
import java.util.Scanner;
public class Array_15 {
    public static void main(String[] args) {
        //  Faça um programa que leia um número indeterminado de valores, correspondentes a notas, encerrando a entrada de dados quando for informado um valor igual a -1 (que não deve ser armazenado).
        //  Após esta entrada de dados, faça:
        //  Mostre a quantidade de valores que foram lidos;
        //  Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
        //  Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
        //  Calcule e mostre a soma dos valores;
        //  Calcule e mostre a média dos valores;
        //  Calcule e mostre a quantidade de valores acima da média calculada;
        //  Calcule e mostre a quantidade de valores abaixo de sete;
        //  Encerre o programa com uma mensagem;

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<Integer>();
        int quantidade = 0;
        int soma = 0;
        int valor;
        int acimaMedia = 0;
        int abaixoSete = 0;

        do {
            System.out.print("Digite um Valor: ");
            valor = input.nextInt();
            if (valor != -1) {
                valores.add(valor);
                quantidade++;
                soma += valor;
            }
        } while (valor != -1);

        float media = (float) soma / valores.size();

        System.out.println("Quantidade de Valores: " + quantidade);

        for (int i = 0; i < valores.size(); i++) {
            System.out.print(valores.get(i) + " ");
            if (valores.get(i) < 7) {
                abaixoSete++;
            }
            if (valores.get(i) > media) {
                acimaMedia++;
            }
        }
        System.out.println("\n");
        for (int i = valores.size() - 1; i >= 0; i--) {
            System.out.println(valores.get(i));
        }

        System.out.println("Soma dos Valores: " + soma);
        System.out.println("Média dos Valores: " + media);
        System.out.println("Quantidade de Valores Acima da Média: " + acimaMedia);
        System.out.println("Quantidade de Valores Abaixo de Sete: " + abaixoSete);
        System.out.println("Programa Encerrado.");
    }
}
