import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

import javax.swing.JOptionPane;

public class Livro extends Autor{

    public String titulo;

    public Autor autor;

    public Float preco;

    public LocalDate dataLancamento;

    public ArrayList<Livro> listaLivro = new ArrayList<>();

    public ArrayList<Autor> listaAutor = new ArrayList<>();


    public static void cadastrarLivro(Livro livro) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Título do Livro: ");
        livro.titulo = scanner.nextLine();

        System.out.print("Autor do Livro: ");
        livro.autor.nome = scanner.nextLine();

        System.out.print("Local de Nascimento do Autor: ");
        livro.autor.localNascimento = scanner.nextLine();

        System.out.print("Preço do Livro: ");
        livro.preco = scanner.nextFloat();
        scanner.nextLine(); // Consumir a quebra de linha.

        System.out.print("Data de Lançamento (dd-MM-yyyy): ");
        String dataString = scanner.nextLine();

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            livro.DataLancamento = dateFormat.parse(dataString);

            int Lancamento = VerificarTempo(livro.DataLancamento);

            if (Lancamento > 5) {
                listaLivros.add(livro);
                System.out.println("Livro cadastrado com sucesso.");
            } else {
                System.out.println("O livro não pode ser cadastrado, pois tem 5 anos ou menos de lançamento.");
            }
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. O livro não foi cadastrado.");
        }
    }


    public void listarLivros(){
        Scanner scanner = new Scanner(System.in);

        if (listaLivro.size() > 0){
            for (Livro cadaLivro : listaLivro){
                System.out.println();
                System.out.println("titulo: " + cadaLivro.titulo);
                System.out.println("autor: " + cadaLivro.autor.nome);
                System.out.println("preco: " + cadaLivro.preco + "R$");
                System.out.println("data de Lancamento: " + cadaLivro.dataLancamento);
            }
        }
        else{
            System.out.println("Lista Vazia!");
        }
    }


    public void verificarTempoLancamento(){
        //FEITO NO METODO DE CADASTRAR
    }


    private static Date gerarData(String dataCadastro) {

        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date casdastroData = data.parse(dataCadastro);
            return casdastroData;
        } catch ( Exception ex) {
            JOptionPane.showMessageDialog(null, "Data invalida");
            return new Date();
        }

    }
}
