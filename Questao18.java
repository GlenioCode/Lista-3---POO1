/*18. Faça um programa que receba o primeiro nome e a quantidade de horas estacionadas de 10 usuários
e calcule o valor a ser pago para cada um. Ao final, o programa deve imprimir a quantidade de dinheiro
arrecadado.
* 
* ● Até 2 horas → R$ 5,00 por hora
● De 3 a 5 horas → R$ 4,00 por hora
● Mais de 5 horas → R$ 3,00 por hora*/
import java.util.Scanner;
public class Questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Nome do usuário " + i + ": ");
            String nome = sc.next();
            System.out.print("Horas estacionadas: ");
            int horas = sc.nextInt();
            double valor = 0;
            if (horas <= 2) valor = horas * 5;
            else if (horas <= 5) valor = horas * 4;
            else valor = horas * 3;
            total += valor;
            System.out.println(nome + " pagará R$ " + valor);
        }
        System.out.println("Total arrecadado: R$ " + total);
    }
}
