/*19. Elabore um algoritmo que receba um número inteiro maior que 1 e verifique se o número é primo ou
não. Mostrar mensagem para os dois casos.*/
import java.util.Scanner;
public class Questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro maior que 1: ");
        int num = sc.nextInt();
        boolean primo = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) System.out.println(num + " é primo.");
        else System.out.println(num + " não é primo.");
    }
}
