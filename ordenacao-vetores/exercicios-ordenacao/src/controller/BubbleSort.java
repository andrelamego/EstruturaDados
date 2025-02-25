package controller;

public class BubbleSort {
    public BubbleSort(){
        super();
    }
    
    public void ordenar(int[] vetor){
        int aux = 0;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if(vetor[j] > vetor[j + 1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }
}
