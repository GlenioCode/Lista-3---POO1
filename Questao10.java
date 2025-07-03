/*10. Peça ao usuário um número N e exiba os primeiros N termos da sequência de Fibonacci.*/
import java.util.Scanner;
public class Questao10{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número de termos da sequência de Fibonacci que deseja ver: ");
		int n = scanner.nextInt();
		
		int primeiro = 0, segundo = 1, contador = 0;
		
		System.out.println("Sequência de Fibonacci com " + n + " termos:");
		
		while (contador < n){
			System.out.print(primeiro + " ");
			int proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			contador++;
			}
		
			System.out.println();
		}
	}
