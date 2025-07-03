/*13. Desenvolva um algoritmo que leia o nome, três notas, calcule a média aritmética simples de 20
alunos. Mostre a situação de cada aluno (Aprovado, Recuperação ou Reprovado)*/
import java.util.Scanner;
public class Questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o nome do aluno " + i + ": ");
            String nome = sc.next();
            double soma = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.print("Nota " + j + ": ");
                soma += sc.nextDouble();
            }
            double media = soma / 3;
            String situacao = (media >= 7) ? "Aprovado" : (media >= 5) ? "Recuperação" : "Reprovado";
            System.out.println(nome + " - Média: " + media + " - Situação: " + situacao);
        }
    }
}
