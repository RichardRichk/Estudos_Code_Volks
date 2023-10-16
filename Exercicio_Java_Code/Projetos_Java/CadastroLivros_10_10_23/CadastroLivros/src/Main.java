import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Autor metodosAutor = new Autor();

        ArrayList<Livro> listaLivro = new ArrayList<>();
        Livro metodosLivro = new Livro();

        System.out.println("Bem vindo ao sistema de cadastro de Pessoa Física e Pessoa Jurídica");

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção: 1 - Cadastrar Livro / 2 - Listar Livros / 0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    metodosLivro.cadastrarLivro();
                    break;

                case 2:
                    metodosLivro.listarLivros();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida, por favor digite uma opcao valida!");
                    break;
            }
        }while (opcao != 0);
    }
}