import java.util.Scanner;

// Faça um programa que receba um número do usuário e continue a pedir o numero se o numero for diferente de 0.

public class Atv08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        byte numero;

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextByte();

            if(numero != 0){
                System.out.println("Digite um número diferente de zero");
            }

        }while (numero != 0);
    }
}
