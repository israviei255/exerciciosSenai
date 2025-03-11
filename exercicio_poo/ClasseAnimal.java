package olamundo.exercicio_poo;
import olamundo.exercicio_poo.classes.Animal;


public class ClasseAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();

        System.out.println("Nome do animal: " + animal.exibirNome("Cachorro"));
        animal.mover();
        animal.emitirSom("Au Au Au...");
        System.out.print("\n");
        animal.alimentar("carnivoro");
    }
}