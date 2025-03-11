package olamundo;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Adivinhe qual número de 1 a 5 eu estou pensando: ");
        int escolha = entrada.nextInt();

        int numRandom = (int) (Math.random() * 5) + 1;
        System.out.print("Número do usuário: " + escolha);
        System.out.print("\nNúmero Random: " + numRandom);

        if (escolha == numRandom){
            System.out.print("\n\nVocê Acertou!");
        } else{
            System.out.printf("\n\nVocê errou, o número correto era %d", numRandom);
        }
    }
}
