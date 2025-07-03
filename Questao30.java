/*30. Faça um programa que exiba as potências de 2 de 2⁰ até 2⁹.*/
public class Questao30 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
        }
    }
}
