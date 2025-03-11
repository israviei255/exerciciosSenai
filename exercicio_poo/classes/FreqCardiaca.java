package olamundo.exercicio_poo.classes;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FreqCardiaca {
    public String nome;
    public String sobrenome;
    public String dataDeNasc;

    public FreqCardiaca(String nome, String sobrenome, String dataDeNasc){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNasc = dataDeNasc;
    }

    public int max(int idade){
        return 220 - idade;
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

    //Getter e Setter dataDeNasc.
    public String getdataDeNasc(){
        return this.dataDeNasc;
    }
    public void setdataDeNasc(String dataDeNasc){
        this.dataDeNasc = dataDeNasc;
    }
}
