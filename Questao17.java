/*17. Peça ao usuário um número N e exiba todos os números de 1 a N que são divisíveis por 3 e 5 ao
mesmo tempo.*/
import java.util.Scanner;
public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número N: ");
        int n = sc.nextInt();
        System.out.println("Números divisíveis por 3 e 5 de 1 a " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
