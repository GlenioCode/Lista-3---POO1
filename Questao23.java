/*23. Elabore um programa que gere um número aleatório entre 0 e 9 e leia um número do usuário. Se o
número digitado for igual ao número gerado, o programa imprime “Acertou”. Caso contrário, ele imprime
“Errou. Tente outra vez.” O programa deve ser executado até o usuário acertar.*/

import java.util.Scanner;
import java.util.Random;
public class Questao23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numero = rand.nextInt(10);
        int palpite;
        do {
            System.out.print("Digite um número entre 0 e 9: ");
            palpite = sc.nextInt();
            if (palpite == numero) System.out.println("Acertou!");
            else System.out.println("Errou. Tente outra vez.");
        } while (palpite != numero);
    }
}
