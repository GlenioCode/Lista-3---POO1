/* 6. Elabore um algoritmo que imprima a quinta parte dos 100 primeiros números inteiros positivos*/
public class Questao06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            double resultado = i / 5.0;
            System.out.println("A quinta parte de " + i + " é " + resultado);
        }
    }
}
