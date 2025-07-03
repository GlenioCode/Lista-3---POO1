/*24. O computador deve gerar um número aleatório entre 1 e 100. O usuário deve tentar adivinhar o
número, e o programa deve informar se o palpite é maior ou menor até que ele acerte.*/

import java.util.Scanner;
import java.util.Random;
public class Questao24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numero = rand.nextInt(100) + 1;
        int palpite;
        do {
            System.out.print("Tente adivinhar o número (1 a 100): ");
            palpite = sc.nextInt();
            if (palpite < numero) System.out.println("Muito baixo.");
            else if (palpite > numero) System.out.println("Muito alto.");
            else System.out.println("Acertou!");
        } while (palpite != numero);
    }
}
