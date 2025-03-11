package olamundo;
import java.util.Scanner;

public class VerificadorEspecieExtincao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String animaisExtincao[] = {"Onça-pintada", "Lobo-guará", "Mico-leão-dourado",
                "Cobra-coral-de-alagoas", "Tartaruga-de-couro"};

        System.out.print("Tente adivinhar alguma espécie brasileira em extinção da lista: ");
        String especie = entrada.nextLine();

        for(String animal: animaisExtincao){
            if (especie.equals(animal)){
                System.out.printf("PARABÉNS VOCÊ ACERTOU! A espécie '%s' está na lista", animal);
                break;
            }
        }
    }
}
