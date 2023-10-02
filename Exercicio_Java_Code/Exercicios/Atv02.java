//Faça um programa que receba um número inteiro do usuário
// e informe se este número é positivo ou negativo.

import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número:");

        int numero = scanner.nextInt();

        if(numero > 0){
            System.out.println("Este número é positivo");
        }
        else{
            System.out.println("Este número é negativo");
        }
    }
}
