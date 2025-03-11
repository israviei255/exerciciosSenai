package olamundo.exercicio_poo;
import olamundo.exercicio_poo.classes.FreqCardiaca;
import java.util.Scanner;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ClasseFreqCardiaca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.print("Digite sua data de nascimento (xx/xx/xxxx): ");
        String dataDeNasc = entrada.nextLine();
        System.out.print("Escolha uma Frequência cardíaca alvo:\n" +
                "[ 1 ] Leve" +
                " [ 2 ] Queima de gordura○" +
                " [ 3 ] Corrida moderada\n" +
                "[ 4 ] Alta intensidade" +
                " [ 5 ] Esforço máximo\n" +
                "Opcão: ");
        int opcao = entrada.nextInt();

        FreqCardiaca freqCardiaca = new FreqCardiaca(nome, sobrenome, dataDeNasc);
        System.out.println("\nSeu nome é " + nome);
        System.out.println("Seu sobrenome é " + sobrenome);
        System.out.println("Sua data de nascimento é " + dataDeNasc);
        int idade = freqCardiaca.calcularIdade(dataDeNasc);
        System.out.printf("Sua idade é: %d anos\n", idade);

        double freqCardMax = freqCardiaca.max(idade);
        System.out.printf("Sua frequência cardíaca máxima é de %.0f bpm\n", freqCardMax);

        switch (opcao) {
            case 1:
                System.out.printf("Sua Frequência cardíaca alvo é de %.1f bpm", freqCardMax * 0.5);
                break;
            case 2:
                System.out.printf("Sua Frequência cardíaca alvo é de %.1f bpm", freqCardMax * 0.6);
                break;
            case 3:
                System.out.printf("Sua Frequência cardíaca alvo é de %.1f bpm", freqCardMax * 0.7);
                break;
            case 4:
                System.out.printf("Sua Frequência cardíaca alvo é de %.1f bpm", freqCardMax * 0.8);
                break;
            case 5:
                System.out.printf("Sua Frequência cardíaca alvo é de %.1f bpm", freqCardMax * 0.9);
                break;
            default:
                System.out.print("Valor inválido ou vazio. Programa encerrado!");
        }
    }
}
