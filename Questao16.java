/*16. Desenvolva um algoritmo que leia dois números. Calcule e mostre:
● A soma dos números pares desse intervalo de números, incluindo os números digitados.
● A multiplicação dos números ímpares desse intervalo de números, incluindo os números
digitados.*/

import java.util.Scanner;
public class Questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        int somaPares = 0;
        int multImpares = 1;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if (i % 2 == 0) somaPares += i;
            else multImpares *= i;
        }
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Multiplicação dos ímpares: " + multImpares);
    }
}
