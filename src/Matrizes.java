import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for(int i = 0; i <3; i++) { //linhas
            for(int j = 0; j<3; j++) { //linhas
                System.out.println(matriz[i][j]);
                System.out.println("Digite um número para a posição: "+i+", "+j);
                matriz[i][j] = scanner.nextInt();
            }
        }



        for(int i = 0; i <3; i++) {
            for(int j = 0; j<3; j++) {
                System.out.println(matriz[i][j] + ", ");
            }
            System.out.println();
        }

    }
}
