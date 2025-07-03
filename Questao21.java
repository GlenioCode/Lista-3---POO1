/*21. Faça um programa que solicite o primeiro nome e a idade de usuários e informe se eles podem votar
ou não:
● Menor que 16 → Não pode votar
● Entre 16 e 17 ou acima de 70 → Voto opcional
● Entre 18 e 69 → Voto obrigatório
O programa deve ter uma opção que permita ao usuário decidir prosseguir com sua execução ou
não. Caso opte por encerrar, o programa deve mostrar a quantidade de usuários lidos, a quantidade de
usuários por faixa etária e a média das idades lidas.*/

import java.util.Scanner;
public class Questao21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, menores16 = 0, votoOpcional = 0, votoObrigatorio = 0, somaIdades = 0;
        String opcao;
        do {
            System.out.print("Digite o nome: ");
            String nome = sc.next();
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            somaIdades += idade;
            total++;
            if (idade < 16) {
                System.out.println(nome + " não pode votar.");
                menores16++;
            } else if ((idade >= 16 && idade <= 17) || idade > 70) {
                System.out.println(nome + ": Voto opcional.");
                votoOpcional++;
            } else {
                System.out.println(nome + ": Voto obrigatório.");
                votoObrigatorio++;
            }
            System.out.print("Deseja continuar? (s/n): ");
            opcao = sc.next();
        } while (opcao.equalsIgnoreCase("s"));
        double media = total > 0 ? (double) somaIdades / total : 0;
        System.out.println("Total de usuários: " + total);
        System.out.println("Menores de 16: " + menores16);
        System.out.println("Voto opcional: " + votoOpcional);
        System.out.println("Voto obrigatório: " + votoObrigatorio);
        System.out.println("Média de idades: " + media);
    }
}
