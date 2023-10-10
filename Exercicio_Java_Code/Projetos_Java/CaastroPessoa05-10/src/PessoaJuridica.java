import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaJuridica extends Pessoa{

    public String cnpj;

    public String razaoSocial;

    ArrayList<PessoaJuridica> listaPj = new ArrayList<>();

    @Override
    public float CalcularImposto(float rendimento) {
        if (rendimento <= 3000){
            return 0;
        } else if (rendimento > 3000 && rendimento <= 6000){
            float resultado = (rendimento / 100) * 2;
            return resultado;
        } else if (rendimento > 6000 && rendimento <= 10000) {
            float resultado = (rendimento / 100) * 3.5f;
            return resultado;
        } else {
            float resultado = (rendimento / 100) * 5;
            return resultado;
        }
    }

    public void Cadastrar(){
        Scanner scanner = new Scanner(System.in);

        PessoaJuridica novaPj = new PessoaJuridica();
        Endereco novoEnderecoPj = new Endereco();

        System.out.println("Digite o nome do PJ:");
        novaPj.nome = scanner.next();

        System.out.println("Digite o cnpj do PJ:");
        novaPj.cnpj = scanner.next();

        System.out.println("Digite o razao social do PJ:");
        novaPj.razaoSocial = scanner.next();

        System.out.println("Digite o Rendimento do PJ:");
        novaPj.rendimento = scanner.nextFloat();

        System.out.println("Digite o logradouro do PJ:");
        novoEnderecoPj.logradouro = scanner.next();

        System.out.println("Digite o numero do logradouro:");
        novoEnderecoPj.numero = scanner.next();

        System.out.println("Este endereço é comercial? S/N: ");
        String endCom;
        endCom = scanner.next();


        if (endCom.equalsIgnoreCase("S")){
            novoEnderecoPj.enderecoComercial = true;
        }else {
            novoEnderecoPj.enderecoComercial = false;
        }

        novaPj.endereco = novoEnderecoPj;

        listaPj.add(novaPj);

        System.out.println("Cadastro realizado com sucesso!");
    }

    public void Listar(){
        Scanner scanner = new Scanner(System.in);

        if (listaPj.size() > 0){
            for (PessoaJuridica cadaPj : listaPj){
                System.out.println();
                System.out.println("Nome: " + cadaPj.nome);
                System.out.println("CPF: " + cadaPj.cnpj);
                System.out.println("Endereço: " + cadaPj.endereco.logradouro + ", " + cadaPj.endereco.numero);
                System.out.println("Imposto a ser pago: " + CalcularImposto(cadaPj.rendimento));
            }
        } else {
            System.out.println("Lista Vazia!");
        }
    }

}
