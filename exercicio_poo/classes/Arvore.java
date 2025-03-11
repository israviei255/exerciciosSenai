package olamundo.exercicio_poo.classes;

public class Arvore {
    public String nome;
    public String tipo;
    public double altura;

    public String exibirNome(String nome) {
        return nome;
    }
    public String exibirTipo(String tipo) {
        return tipo;
    }
    public double exibirAltura(double altura) {
        return altura;
    }
    public double calcularOxigenio(double altura) {
        double oxigenio = ((int) altura) * 10;
        return oxigenio;
    }
}
