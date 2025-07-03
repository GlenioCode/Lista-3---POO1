/*11. Solicite dois números A e B e exiba a soma de todos os números ímpares entre eles (incluindo A e B,
se forem ímpares).*/
import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número A: ");
        int a = sc.nextInt();
        System.out.print("Digite o número B: ");
        int b = sc.nextInt();
        int soma = 0;
        int inicio = Math.min(a, b);
        int fim = Math.max(a, b);
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) soma += i;
        }
        System.out.println("Soma dos ímpares: " + soma);
    }
}
