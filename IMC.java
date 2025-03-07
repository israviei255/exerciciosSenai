package olamundo;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua altura (duas casas decimais): ");
        double altura = entrada.nextDouble();

        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Sua altura é: %.2fm", altura);
        System.out.printf("\nSeu peso é: %.1fKg", peso);
        System.out.printf("\nSeu IMC é: %.2f", imc);
    }
}
