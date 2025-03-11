package olamundo.exercicio_poo.classes;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Month;

public class PerfilDeSaude {
    public String nome;
    public String sobrenome;
    public String sexo;
    public String dataDeNasc;
    public double altura;
    public double peso;

    public PerfilDeSaude(String nome, String sobrenome, String sexo, String dataDeNasc, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataDeNasc = dataDeNasc;
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularIMC(double peso, double altura){
        return peso / (altura*altura);
    }

    public double freqCardMax(int idade){
        return 220 - idade;
    }

    public double freqCardAlvo(int opcao, double freqCardMax){
        double freqCardAlvo = 0;
        switch (opcao) {
            case 1:
                freqCardAlvo = freqCardMax * 0.5;
            case 2:
                freqCardAlvo = freqCardMax * 0.6;
            case 3:
                freqCardAlvo = freqCardMax * 0.7;
            case 4:
                freqCardAlvo = freqCardMax * 0.8;
            case 5:
                freqCardAlvo = freqCardMax * 0.9;
        }
        return freqCardAlvo;
    }

    public int calcularIdade(String dataDeNasc){
        // Corrigindo a string da zona de tempo
        ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
        // Obtendo a data e hora atuais na zona de tempo especificada
        ZonedDateTime hoje = ZonedDateTime.now(zoneId);
        int dia = Integer.parseInt(dataDeNasc.substring(0, 2));
        int mes = Integer.parseInt(dataDeNasc.substring(3, 5));
        int ano = Integer.parseInt(dataDeNasc.substring(6, 10));
        if (mes <= hoje.getMonthValue() && dia <= hoje.getDayOfMonth()){
            int idade = hoje.getYear() - ano;
            return idade;
        } else {
            int idade = hoje.getYear() - ano;
            return idade-1;
        }
    }

    //Getter and Setter nome
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    //Getter and Setter sobrenome
    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.nome = sobrenome;
    }

    //Getter e Setter sexo
    public String getSexo(){
        if (this.sexo.equals("M")){
            this.sexo = "Masculino";
        }else{
            this.sexo = "Feminino";
        }
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    //Getter e Setter dataDeNasc
    public String getdataDeNasc(){
        return this.dataDeNasc;
    }
    public void setdataDeNasc(String dataDeNasc){
        this.dataDeNasc = dataDeNasc;
    }

    //Getter e Setter altura
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.sexo = sexo;
    }

    //Getter e Setter peso
    public double getPeso(){
        return this.peso;
    }
    public void setSexo(double peso){
        this.peso = peso;
    }
}