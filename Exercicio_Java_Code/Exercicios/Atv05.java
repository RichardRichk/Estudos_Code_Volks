//Exercício: Verificação de idade
//Escreva um programa que solicita o ano de nascimento de uma pessoa e verifica se ela é maior de 18 anos.
//Exiba uma mensagem indicando se a pessoa é maior de idade ou não.

import java.util.Scanner;

public class Atv05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        byte idade = scanner.nextByte();

        if(idade > 18){
            System.out.println("Você é maior de idade");
        }
        else{
            System.out.println("Você é menor de idade");
        }
    }
}
