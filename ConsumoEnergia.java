package olamundo;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ConsumoEnergia {
    public static void main(String[] args) {
        ArrayList<Integer> consumoMensal = new ArrayList(Arrays.asList(200, 200, 150, 175, 101,
                202, 215, 250, 180, 279, 281, 182));
        int consumoAno = 0;

        for (int mes : consumoMensal){
            consumoAno += mes;
        }

        double media = consumoAno / consumoMensal.size();
        if (media > 200){
            System.out.printf("MÉDIA DE CONSUMO ANUAL DA SUA RESIDÊNCIA: %.1fkWh\n", media);
            System.out.print("ESTÁ ACIMA DA MÉDIA SUSTENTÁVEL DE 200kWh. Tente economizar da próxima vez.");
        }else{
            System.out.printf("MÉDIA DE CONSUMO ANUAL DA SUA RESIDÊNCIA: %.1fkWh\n", media);
            System.out.print("ESTÁ DENTRO DA MÉDIA SUSTENTÁVEL DE 200kWh. Muito bem, continue assim.");
        }
    }
}
