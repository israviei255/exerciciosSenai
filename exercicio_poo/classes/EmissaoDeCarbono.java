package olamundo.exercicio_poo.classes;

public class EmissaoDeCarbono {
    public String atividade;
    public double qntCarbono;

    public String exibirAtividade(String atividade){
        return atividade;
    }
    public double calcularEmissaoCO2(double minutos, double qntCarbono){
        double hora = minutos / 60;
        double total = qntCarbono * hora;
        return total;
    }
}
