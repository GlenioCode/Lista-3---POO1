/*3. Peça ao usuário um número e exiba a tabuada desse número de 1 a 10.*/

import java.util.Scanner;
public class Questao03{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//solicita o número ao usuário
		System.out.println("Digite um número para ver a tabuada: ");
		int numero = scanner.nextInt();
		
		// laço de repetiçao com while
		int i = 1;; // começa com 1
		while (i<=10){
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
			i++; // incrementa i em 1
		}
	}
}