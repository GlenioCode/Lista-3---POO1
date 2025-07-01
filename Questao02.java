/*2. Peça ao usuário um número inteiro positivo N e calcule a soma de todos os números de 1 até N.*/
import java.util.Scanner;
public class Questao02{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		// solicita o número N ao usuário
		System.out.println("Digite um número inteiro positivo: ");
		int n = scanner.nextInt();
		
		//variavel para guardar a soma[
		int soma = 0;
		
		//laço de repetição: soma de 1 até NClob
		int i = 1; //começa em 1
		while (i <=n){
			soma = soma + i; //soma atual + valor de i
			i++; //incrementa i (i = i+1);
		}
		// mostra o resultado
		System.out.println("A soma de 1 até " + n + " é: " + soma);
	}
}