/*2. Crie um programa que peça a velocidade de carros e classifique:
● Abaixo de 40 km/h → "Lento"
● Entre 40 e 60 km/h → "Velocidade permitida"
● Acima de 60 km/h → "Acima da velocidade permitida"
O programa deve ter uma opção que permita ao usuário decidir prosseguir com sua execução ou
não. Caso opte por encerrar, o programa deve mostrar a quantidade de carros lidos, a quantidade de
carros por faixa de velocidade e a média das velocidades lidas.*/

import java.util.Scanner;
public class Questao22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, lentos = 0, permitidos = 0, acima = 0, soma = 0;
        String opcao;
        do {
            System.out.print("Digite a velocidade do carro: ");
            int v = sc.nextInt();
            soma += v;
            total++;
            if (v < 40) {
                System.out.println("Lento");
                lentos++;
            } else if (v <= 60) {
                System.out.println("Velocidade permitida");
                permitidos++;
            } else {
                System.out.println("Acima da velocidade permitida");
                acima++;
            }
            System.out.print("Deseja continuar? (s/n): ");
            opcao = sc.next();
        } while (opcao.equalsIgnoreCase("s"));
        double media = total > 0 ? (double) soma / total : 0;
        System.out.println("Total de carros: " + total);
        System.out.println("Lentos: " + lentos);
        System.out.println("Velocidade permitida: " + permitidos);
        System.out.println("Acima do limite: " + acima);
        System.out.println("Média das velocidades: " + media);
    }
}
