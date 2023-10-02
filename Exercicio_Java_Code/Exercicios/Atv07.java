import java.util.Scanner;

public class Atv07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.In);

        final String senha = "123";
        String senhaDigitada;

        do {

            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();

            if (!senha.equals("123")){
                System.out.print("Senha incorreta ");
            }

        } while (!senha.equals("123"));

        System.out.println("Senha correta! Acesso concedido.");
    }
}
