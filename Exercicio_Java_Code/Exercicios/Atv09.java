//Apresente o valor do salário atual e adicione 100 até que chegue em 5000

import  java.util.Scanner;
public class Atv09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int salario = 1000;

        while (salario < 5000){

            salario += 100;

            System.out.printf("O salário ainda é de %d", salario);
        }
        System.out.println("O salário atingiu R$5000");
    }
}
