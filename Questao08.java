/*8. Peça ao usuário dois números X e N, e exiba os N primeiros múltiplos de X*/
import java.util.Scanner;
public class Questao08{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o valor de X: ");
		int x = scanner.nextInt();
		
		System.out.println("Digite o valor de N: ");
		int n = scanner.nextInt();
		
		System.out.println("Os " + n + " primeiros múltiplos de " + x + " são:");
		
		for (int i = 1; i<=n; i++){
			int multiplo = x * i;
			System.out.println(multiplo);
			}
		
		
		}
	}
