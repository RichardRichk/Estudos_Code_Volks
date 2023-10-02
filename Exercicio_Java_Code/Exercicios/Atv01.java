//Você irá gerar uma média de duas notas, e caso a nota seje maior igual a 6, precisa aparecer uma mensagem de parabéns, caso não seje maior igual a 6, informe ao usuário que ele não passou.
import  java.util.Scanner;

public class Atv01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite sua segunda nota: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;

        if(media >= 6){
            System.out.printf("Parabéns! Sua nota média foi %f", media);
        } else{
            System.out.printf("Você não passou, sua nota média foi %f. Para passar você precisaria atingir 6 pontos", media);
        }
    }
}
