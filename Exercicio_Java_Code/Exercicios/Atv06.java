//Listar alunos e verificar posição na lista
// Se o numero for par, escreva "par" e o numero correspondente
//Se o numero for impar, escreva "impar" e o numero correspondente
//Se for zero, escreva "zero"

public class Atv06 {
    public static void main(String[] args){

        String[] professores = {"Thiago", "Jéssica", "Alana", "Samanta", "Alexia", "Odirlei", "Possarle"};

        for(int i = 0; i < professores.length; i++)
        {
            System.out.println("O índice atual é " + i);

            if(i == 0)
            {
                System.out.println("O número de índice do(a) professor(a) " +professores[i]+ " é zero");
            }
            else if(i % 2 == 0)
            {
                System.out.println("O número de índice do(a) professor(a) " +professores[i]+ " é par");
            }
            else
            {
                System.out.println("O número de índice do(a) professor(a) " +professores[i]+ " é ímpar");
            }
        }
    }
}
