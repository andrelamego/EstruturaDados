package view;

import controller.BubbleSort;
import controller.MergeSort;

public class Main {
    public static void Ordenar(int[] vetor){
        BubbleSort bubble = new BubbleSort();
        MergeSort merge = new MergeSort();
    
        double tempo_inicio, tempo_final;
        double tempo_bubble, tempo_merge;
    
    
        tempo_inicio = System.nanoTime();
        bubble.ordenar(vetor);
        tempo_final = System.nanoTime();
        tempo_bubble = tempo_final - tempo_inicio;
        tempo_bubble = tempo_bubble / Math.pow(10, 9);
        
        System.out.println("Bubble Sort:");
        Exibir(vetor, tempo_bubble);
    
    
        tempo_inicio = System.nanoTime();
        merge.ordenar(vetor);
        tempo_final = System.nanoTime();
        tempo_merge = tempo_final - tempo_inicio;
        tempo_merge = tempo_merge / Math.pow(10, 9);
        
        System.out.println("Merge Sort:");
        Exibir(vetor, tempo_merge);
    }

    public static void Exibir(int[] vetor, double tempo_exec){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+"   ");    
        }
        System.out.println("\n");
        System.out.println("Tempo de Execucao: "+tempo_exec+"s");
        System.out.println("\n");
    }

    
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 1000);
        }

        Ordenar(vetor);
    }
}
