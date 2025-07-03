/*27. Elabore um programa que peça ao usuário para inserir 10 números e exiba quantos são positivos e
quantos são negativos.*/
import java.util.Scanner;
public class Questao27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0, negativos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();
            if (num >= 0) positivos++;
            else negativos++;
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}
