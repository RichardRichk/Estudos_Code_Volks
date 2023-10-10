import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pessoa {
    public String nome;
    public float rendimento;
    public Endereco endereco;
    public float CalcularImposto(float rendimento){
        return rendimento;
    }
}