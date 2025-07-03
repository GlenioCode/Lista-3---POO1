/*25. Peça ao usuário um número inteiro positivo e verifique se ele é um palíndromo (ou seja, se ele lido de
trás para frente é igual ao original).*/
import java.util.Scanner;
public class Questao25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int num = sc.nextInt();
        String original = Integer.toString(num);
        String invertido = new StringBuilder(original).reverse().toString();
        if (original.equals(invertido)) {
            System.out.println(num + " é um palíndromo.");
        } else {
            System.out.println(num + " não é um palíndromo.");
        }
    }
}
