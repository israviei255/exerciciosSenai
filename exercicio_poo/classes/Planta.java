package olamundo.exercicio_poo.classes;

public class Planta {
    public String nome;
    public String tipo;
    public int qtdSemanas;
    public int necessidadeDeAgua;
    public int area;

    public String pegarNome(String nomePlanta){
        this.nome = nomePlanta;
        return this.nome;
    }
    public String pegarTipo(String tipoPlanta){
        this.tipo = tipoPlanta;
        return this.tipo;
    }

    public int necessidadeDeAgua(int litro, int area){
        this.area = area;
        this.necessidadeDeAgua = litro * this.area;
        return this.necessidadeDeAgua;
    }

    public int calcularNecessidadeDeAgua(int qtdSemanas) {
        this.qtdSemanas = qtdSemanas;
        int porSemana = this.necessidadeDeAgua * 7;
        int necessidadeDeAguaSemanas = porSemana * this.qtdSemanas;
        return necessidadeDeAguaSemanas;
    }
}
