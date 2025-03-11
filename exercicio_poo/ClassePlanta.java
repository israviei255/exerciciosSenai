package olamundo.exercicio_poo;
import olamundo.exercicio_poo.classes.Planta;

public class ClassePlanta {
    public static void main(String[] args) {
        Planta planta = new Planta();

        planta.pegarNome("Alface");
        planta.pegarTipo("Horta");
        int qtdAgua = planta.necessidadeDeAgua(6, 10);
        System.out.printf("O/A %s necessita de %d litros de água em um(a) %s durante um dia em uma área de %dm²\n\n",
                planta.nome, qtdAgua, planta.tipo, planta.area);
        int qtdAguaSemanas = planta.calcularNecessidadeDeAgua(4);
        System.out.printf("O/A %s necessita de %d litros de água em um(a) %s durante %d semanas em " +
                        "uma área de %dm²\n", planta.nome, qtdAguaSemanas, planta.tipo, planta.qtdSemanas, planta.area);
    }
}
