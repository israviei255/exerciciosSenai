package olamundo.exercicio_poo;
import olamundo.exercicio_poo.classes.EmissaoDeCarbono;

public class ClasseEmissaoDeCarbono {
    public static void main(String[] args) {
        EmissaoDeCarbono EmissaoCo2 = new EmissaoDeCarbono();
        double carbonoTotal = EmissaoCo2.calcularEmissaoCO2(1000, 0.5);
        System.out.println(EmissaoCo2.exibirAtividade("USAR ELETRÔNICOS"));
        System.out.printf("Consome %.1f kilos de carbono durante o período fornecido", carbonoTotal);
    }
}
