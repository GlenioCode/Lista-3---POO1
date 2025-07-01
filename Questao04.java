/*4. Solicite um número inteiro positivo N e exiba todos os números pares de 1 até N.*/
import java.util.Scanner;

public class Questao04{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		// ler número n do usuário
		System.out.println("Digite um número inteiro positivo: ");
		int n = scanner.nextInt();
		
		//começa o contador em 1
		int i = 1;
		
		// enquanto i for menor ou igual a NClob
		while (i <= n){
			// for i par (resto da divisiao por 2 for zero)
			 if (i % 2 == 0) {
                System.out.println(i + " é par");
            } 
			i++; //incrementa o contador
		}
	}
}