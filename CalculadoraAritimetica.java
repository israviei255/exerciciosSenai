package olamundo;
import java.util.Scanner;

public class CalculadoraAritimetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o 1º número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Digite o 2º número: ");
        double num2 = entrada.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = entrada.next();

        String operacaoExtenso = "";
        double resultado = 0;

        if (operacao.equals("+")){
            operacaoExtenso = "soma";
            resultado = num1 + num2;
        } else if (operacao.equals("-")){
            operacaoExtenso = "subtração";
            resultado = num1 - num2;
        } else if (operacao.equals("*")){
            operacaoExtenso = "multiplicação";
            resultado = num1 * num2;
        } else if (operacao.equals("/")){
            operacaoExtenso = "dvisão";
            resultado = num1 / num2;
        }

        System.out.printf("O resultado da %s de %.1f e %.1f é: %.1f", operacaoExtenso, num1, num2, resultado);
    }
}
