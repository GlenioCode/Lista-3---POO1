/*12. Solicite dois números inteiros X e Y e calcule X elevado a Y usando apenas multiplicações dentro de
um laço de repetição.*/
import java.util.Scanner;
public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número X: ");
        int x = sc.nextInt();
        System.out.print("Digite o número Y: ");
        int y = sc.nextInt();
        int resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado *= x;
        }
        System.out.println(x + " elevado a " + y + " é: " + resultado);
    }
}
