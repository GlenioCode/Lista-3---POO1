import java.util.Scanner;

public class Questao05{
	public static void main(String[]args){
		Scanner scanner = new Scanner (System.in);
		
		// pergunta quantos números o usuário quer informar
		System.out.println("Quantos valores você quer digitar? ");
		int n = scanner.nextInt();
		
		int contador = 1; // começa do 1
		double soma = 0; //acumula valores digitados
		
		//lê os  N valores usando while
		while (contador <=n){
			System.out.println("Digite o " + contador + " valor: ");
			double valor = scanner.nextDouble() ; // lê o valor do usuário
			soma += valor; //soma = soma + valor
			contador++; //próximo número
		}
		
		//calculando a média
		double media = soma /n;
		
		// exibe o resultado
		System.out.println("A média dos " + n + " valores é: " + media);
	}
}