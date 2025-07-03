/*20. Desenvolva um algoritmo que leia um número e informe quantos e quais são seus divisores.*/
import java.util.Scanner;
public class Questao20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        System.out.println("Divisores de " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
