/*9. Peça ao usuário um número inteiro positivo e exiba o fatorial desse número.*/
import java.util.Scanner;
public class Questao09{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		//solicita um número positivo ao usuario
		System.out.println("Digite um número inteiro positivo: ");
		numero = scanner.nextInt();
		
		// validação simples (positivos)
		if (numero < 0){
			System.out.println("Número inválido! Digite apenas positivos.");
			return;
			}
		int fatorial = 1;
		int i = 1;
		
		//calculando com while
		while ( i<= numero){
			fatorial *= i;
			i++;
			}	
		System.out.println("Faotirla de " + numero + " é: " + fatorial);	
			
		}
	}
