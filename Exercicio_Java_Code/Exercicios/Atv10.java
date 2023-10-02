// Apresente a lista de carros

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] carros = {"Mustang", "Maverick", "Cayenne", "Ferrari"};

        System.out.println("Lista de carros: ");

        for (String carro : carros) {
            System.out.println(carro);
        }
    }
}
