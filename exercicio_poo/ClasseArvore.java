package olamundo.exercicio_poo;
import olamundo.exercicio_poo.classes.Arvore;

public class ClasseArvore {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        System.out.println("Nome da árvore: " + arvore.exibirNome("Carvalho"));
        System.out.println("Tipo de árvore: " + arvore.exibirTipo("Conífera"));
        System.out.printf("Altura da árvore: %.1fm", arvore.exibirAltura(10.2));
        System.out.printf("\nA árvore produz %.0fg por dia de oxigênio (1 grama por metro)", arvore.calcularOxigenio(10.2));
    }
}
