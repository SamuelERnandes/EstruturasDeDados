import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>(); // instância do Objeto

        System.out.println("Digite o primeiro nome: ");
        String nome = scanner.nextLine();
        while(!nome.equals("break")){
            nomes.add(nome);
            System.out.println("Digite o proximo nome: ");
            nome = scanner.nextLine();
        }

        for(String aluno : nomes) {
            System.out.println("Nome do Aluno: "+aluno);
        }

    }
}
