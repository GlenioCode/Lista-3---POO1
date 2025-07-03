/*26. Faça um programa que receba do usuário um número N e calcule a soma da série: 1 + 1/2 + 1/3 + ... +
1/N.*/
import java.util.Scanner;
public class Questao26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número N: ");
        int n = sc.nextInt();
        double soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }
        System.out.println("Soma da série: " + soma);
    }
}
