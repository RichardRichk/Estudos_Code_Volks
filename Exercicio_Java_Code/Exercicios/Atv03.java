//Exercício: Verificação de dia da semana
//Escreva um programa que solicita ao usuário um número de 1 a 7 representando um dia
//da semana e exibe o nome correspondente a esse dia. Considere que 1 representa segunda-feira,
//2 representa terça-feira e assim por diante.

import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número e descubra qual dia da semana ele representa: ");
        byte diaSemana = scanner.nextByte();

        if(diaSemana == 1){
            System.out.println("Hoje é Segunda-feira!");
        }
        if(diaSemana == 2){
            System.out.println("Hoje é Terça-feira!");
        }
        if(diaSemana == 3){
            System.out.println("Hoje é Quarta-feira!");
        }
        if(diaSemana == 4){
            System.out.println("Hoje é Quinta-feira!");
        }
        if(diaSemana == 5){
            System.out.println("Hoje é Sexta-feira!");
        }
        if(diaSemana == 6){
            System.out.println("Hoje é Sábado!");
        }
        if(diaSemana == 7){
            System.out.println("Hoje é Domingo!");
        }
    }
}
