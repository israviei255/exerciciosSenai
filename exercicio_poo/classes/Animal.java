package olamundo.exercicio_poo.classes;

public class Animal {
    public String nome;
    public String habitat;
    public String som;
    public String tipoDeAlimentacao;

    public String exibirNome(String nome){
        return nome;
    }

    public void mover() {
        System.out.println("está caminhando...");
    }
    public void emitirSom(String som) {
        System.out.println(som);
    }
    public void alimentar(String tipoDeAlimentacao) {
        if (tipoDeAlimentacao.equals("herbivoro")) {
            System.out.print("Hmmm... vegetais são deliciosos.");
        }else if (tipoDeAlimentacao.equals("carnivoro")){
            System.out.print("Hmmm... carnes são deliciosas.");
        }else{
            System.out.print("Hmmm... parece que você comeu caracteres...");
        }
    }
}