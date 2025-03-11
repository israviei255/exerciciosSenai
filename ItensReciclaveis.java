package olamundo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItensReciclaveis {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); //instanciando Scanner
        List listaReciclaveis  = new ArrayList(); //instanciando ArrayList

        for(int i = 0; i < 5; i++){
            if (i == 0){
                System.out.print("Adicione um item reciclável à lista: ");
                String item = entrada.nextLine();
                listaReciclaveis.add(item);
            }else if (i < 4){
                System.out.print("Adicione outro item reciclável à lista: ");
                String item = entrada.nextLine();
                listaReciclaveis.add(item);
            }else{
                System.out.print("Adicione o último item reciclável à lista: ");
                String item = entrada.nextLine();
                listaReciclaveis.add(item);
            }
        }

        System.out.print("Lista de itens: " + listaReciclaveis);
    }
}
