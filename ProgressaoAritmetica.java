package olamundo;
import java.util.Scanner;

public class ProgressaoAritmetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor inicial para a P.A: ");
        int numPA = entrada.nextInt();
        System.out.print("Digite a Raiz da P.A: ");
        int raiz = entrada.nextInt();


        System.out.print("Quer mostrar os primeiros 10 valores da P.A?(s/n) ");
        String resp = entrada.next();
        while(!resp.equals("n")){
            for (int i = 1; i <= 10; i++){
                System.out.printf("%d...", numPA);
                numPA = numPA + raiz;
            }

            System.out.print("Quer mostrar os próximos 10 termos da P.A?(s/n) ");
            resp = entrada.next();
        }
    }
}
