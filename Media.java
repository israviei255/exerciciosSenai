package olamundo;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a 1ª nota do semestre: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Digite a 2ª nota do semestre: ");
        double nota2 = entrada.nextDouble();
        System.out.print("Digite a 3ª nota do semestre: ");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Sua média final é: %.2f", media);
    }
}
