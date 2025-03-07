package olamundo;

public class OlaMundo {
    public static void main(String[] args){
        System.out.println("Olá, Mundo!");
        int anoNascimento = 1996;
        System.out.println(anoNascimento);
        char uma = 'J';
        System.out.println(uma);
        long id = 1234567890656456L;
        double altura = 1.75;
        System.out.println(altura);
        boolean ehcasado = true;
        System.out.println(ehcasado);

        float peso = 85.6f;
        String nome = "isa";
        int idade = (int) 28.5; //convertendo para int

        System.out.printf("Nome: %s Ano de Nascimento: %d Altura: %.2fm", nome, anoNascimento, peso);
    }
}