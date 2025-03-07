package olamundo;

public class TemperaturaMedia {
    public static void main(String[] args){
        double tempCelcius[] = {30, 20, 25, 15, 18, 22, 27};
        String diasDaSemana[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        double somaTempCelcius = 0;

        for (int i = 0; i < tempCelcius.length; i++){
            somaTempCelcius += tempCelcius[i];
        }

        double mediaTempCelcius = somaTempCelcius / tempCelcius.length;
        for (int i = 0; i < tempCelcius.length; i++){
            System.out.printf("%s: %.1fºC ", diasDaSemana[i], tempCelcius[i]);
        }
        System.out.printf("\nTEMPERATURA MÉDIA DA SEMANA: %.1fºC ", mediaTempCelcius);
    }
}
