package olamundo;
import java.util.Scanner;

public class NomeSobrenome {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu Sobrenome: ");
        String sobrenome = entrada.next();
        System.out.print("Digite seu Nome: ");
        String nome = entrada.next();


        System.out.printf("Seu nome completo é: %s %s", nome, sobrenome);
        System.out.printf("\nSeu primeiro nome tem: %d letras\n", nome.length());
        System.out.printf("Seu nome completo tem: %d letras", (nome + sobrenome).length());
    }
}
