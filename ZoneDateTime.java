// Para gerar data e hora em tempo real

package olamundo;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Month;

public class ZoneDateTime {
    public static void main(String[] args) {
        // Corrigindo a string da zona de tempo
        ZoneId zoneId = ZoneId.of("America/Sao_Paulo");

        // Obtendo a data e hora atuais na zona de tempo especificada
        ZonedDateTime hoje = ZonedDateTime.now(zoneId);

        // Obtendo o mês atual
        Month mes = hoje.getMonth();

        // Obtendo o valor numérico do mês (1-12)
        int mesNumerico = mes.getValue();

        // Imprimindo o resultado
        System.out.println("Mês atual (numérico): " + mesNumerico);
    }
}
