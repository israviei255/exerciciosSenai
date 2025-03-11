package olamundo;

public class MonitoramentoDoAr {
    public static void main(String[] args){
        int IQA[] = {130, 90, 140, 120, 101};

        for(int i = 0; i < IQA.length; i++){
            if (IQA[i] > 100){
                System.out.printf("CIDADE %d: POSSUI VALOR ACIMA DO LIMITE SEGURO valor: %d\n", i+1, IQA[i]);
            }
        }
    }
}