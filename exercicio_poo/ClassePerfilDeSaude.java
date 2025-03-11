package olamundo.exercicio_poo;
import olamundo.exercicio_poo.classes.FreqCardiaca;
import olamundo.exercicio_poo.classes.PerfilDeSaude;
import java.util.Scanner;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ClassePerfilDeSaude {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do paciente: ");
        String nome = entrada.nextLine();
        System.out.print("Digite o sobrenome do paciente: ");
        String sobrenome = entrada.nextLine();
        System.out.print("Digite o sexo do paciente (M/F): ");
        String sexo = entrada.nextLine();
        System.out.print("Digite a data de nascimento do paciente (xx/xx/xxxx): ");
        String dataDeNasc = entrada.nextLine();
        System.out.print("Digite a altura do paciente (m): ");
        Double altura = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite o peso do paciente (Kg): ");
        Double peso = Double.parseDouble(entrada.nextLine());
        System.out.print("Escolha uma Frequência cardíaca alvo:\n" +
                "[ 1 ] Leve" +
                " [ 2 ] Queima de gordura" +
                " [ 3 ] Corrida moderada\n" +
                "[ 4 ] Alta intensidade" +
                " [ 5 ] Esforço máximo\n" +
                "Opcão: ");
        int opcao = entrada.nextInt();
        PerfilDeSaude perfilDeSaude = new PerfilDeSaude(nome, sobrenome, sexo, dataDeNasc, altura, peso);
        int idade = perfilDeSaude.calcularIdade(dataDeNasc);
        double freqCardMax = perfilDeSaude.freqCardMax(idade);

        System.out.println("\nNome do paciente: " + perfilDeSaude.getNome());
        System.out.println("Sobrenome do paciente: " + perfilDeSaude.getSobrenome());
        System.out.println("Sexo do paciente: " + perfilDeSaude.getSexo());
        System.out.println("Data de nascimento do paciente: " + perfilDeSaude.getdataDeNasc());
        System.out.printf("Altura do paciente: %.2fm\n", perfilDeSaude.getAltura());
        System.out.printf("Peso do paciente: %.0fKg\n", perfilDeSaude.getPeso());
        System.out.printf("Idade do paciente: %d anos\n", idade);
        System.out.printf("IMC do paciente: %.1f\n", perfilDeSaude.calcularIMC(peso, altura));
        System.out.printf("Frequência cardíaca máxima do paciente: %.0f bpm\n", perfilDeSaude.freqCardMax(idade));
        System.out.printf("Frequência cardíaca alvo do paciente: %.0f bpm", perfilDeSaude.freqCardAlvo(opcao, freqCardMax));
    }
}