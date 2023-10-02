//Exercício: Verificação de login
//Escreva um programa que solicita ao usuário um nome de usuário e uma senha.
//Verifique se o nome de usuário é "admin" e a senha é "senha123".
//Exiba uma mensagem indicando se o login foi bem-sucedido ou não.

import java.util.Scanner;

public class Atv04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do usuário: ");
        final String usuario = scanner.next();

        System.out.print("Digite a senha: ");
        final String senha = scanner.next();

        if((usuario.equals("admin")) && (senha.equals("senha123"))){
            System.out.println("Login efetuado");
        }
        else{
            System.out.println("Usuário ou senha errados");
        }
    }
}
