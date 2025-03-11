package olamundo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class RoteiroTrilhaEcologica {
    public static void main(String[] args) {
        List<String> paradas = new ArrayList();
        Scanner entrada = new Scanner(System.in);

        String resp;
        do {
            System.out.print("DESEJA INSERIR UMA PARADA?(s/n) ");
            resp = entrada.nextLine();
            if (resp.equals("s")){
                System.out.print("Digite o nome da parada: ");
                String parada = entrada.nextLine();
                System.out.print("A parada está em uma posição anterior?(s/n) ");
                String resp2 = entrada.nextLine();
                if (resp2.equals("s")){
                    System.out.print("Digite a posição da parada (Nº inteiro): ");
                    int posicao =  Integer.parseInt(entrada.nextLine());
                    paradas.add(posicao-1, parada);
                }else{
                    paradas.add(parada);
                }
            }
            System.out.print("\n");
        }while(resp.equals("s"));

        for(int i = 0; i < paradas.size(); i++){
            System.out.printf("\n%dª parada: %s", i+1, paradas.get(i));
        }
    }
}
