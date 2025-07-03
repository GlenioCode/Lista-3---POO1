/*29. Desenvolva um programa que peça ao usuário para inserir uma sequência de números positivos
(terminando em um número negativo). Em seguida, exiba o maior e o menor número informados.*/
import java.util.Scanner;
public class Questao29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        do {
            System.out.print("Digite um número positivo (ou negativo para parar): ");
            num = sc.nextInt();
            if (num >= 0) {
                if (num > maior) maior = num;
                if (num < menor) menor = num;
            }
        } while (num >= 0);
        if (maior == Integer.MIN_VALUE) {
            System.out.println("Nenhum número positivo informado.");
        } else {
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
        }
    }
}
