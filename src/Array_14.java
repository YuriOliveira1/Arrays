import java.util.ArrayList;
import java.util.Scanner;
public class Array_14 {
    public static void main(String[] args) {
        // Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        //"Telefonou para a vítima?"
        //"Esteve no local do crime?"
        //"Mora perto da vítima?"
        //"Devia para a vítima?"
        //"Já trabalhou com a vítima?"
        // O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
        // Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
        // e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

        Scanner input = new Scanner(System.in);

        ArrayList<String> respostas = new ArrayList<String>();

        System.out.println("Telefonou para a vítima?");
        respostas.add(input.nextLine().toLowerCase());
        System.out.println("Esteve no local do crime?");
        respostas.add(input.nextLine().toLowerCase());
        System.out.println("Mora perto da vítima?");
        respostas.add(input.nextLine().toLowerCase());
        System.out.println("Devia para a vítima?");
        respostas.add(input.nextLine().toLowerCase());
        System.out.println("Já trabalhou com a vítima?");
        respostas.add(input.nextLine().toLowerCase());

        int count = 0;

        for (int i = 0; i < respostas.size(); i++) {
            if (respostas.get(i).equals("sim")) {
                count++;
            }
        }

        if (count == 2){
            System.out.println("Suspeita");
        }
        else if (count == 3 || count == 4){
            System.out.println("Cúmplice");
        }
        else if (count == 5){
            System.out.println("Assassino");
        }
        else{
            System.out.println("Inocente");
        }

    }
}
