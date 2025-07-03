/*5. Elabore um algoritmo que mostre quantos e quais os números pares e ímpares entre 1 e 100.*/
public class Questao15 {
    public static void main(String[] args) {
        int pares = 0, impares = 0;
        System.out.print("Números pares: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                pares++;
            }
        }
        System.out.println("\nTotal de pares: " + pares);

        System.out.print("Números ímpares: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                impares++;
            }
        }
        System.out.println("\nTotal de ímpares: " + impares);
    }
}
