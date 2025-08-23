package questao2;

//Riccardo André Cattelan
//Edivaldo Sousa Pinheiro

import java.util.Scanner;

public class GCQ2 {
    static int[] array;
    static boolean verificarAlocado = false;

    Scanner scanner = new Scanner(System.in);
    public static void verificacao() {
        if (verificarAlocado==true) {
            System.out.println("A memória já está alocada");
        } else {
            System.out.println("A memória não está alocada");
        }
    }

    public static void alocar(int tamanho) {
        if (tamanho>0) {
            array=new int[tamanho];
            verificarAlocado=true;
            System.out.printf("Foram alocados %d blocos na memória", tamanho);
        } else {
            System.out.println("Erro: tamanho inválido");
        }
    }

    public static void exibir() {
        try {
            if (verificarAlocado == true && array!=null) {
                int j = 0;
                for (int num : array) {
                    System.out.printf("Index %d: valor %d%n", j, num);
                    j++;
                }
            } else if (array==null) {
                System.out.println("Array está vazio");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void liberarMem() {
        if (verificarAlocado==true) {
            verificarAlocado = false;
            array = null; //deixando o array sem utilidade, para o Garbage Collector limpar
            System.gc(); //chamando o Garbage Collector só como forma de incentivar o GB a acontecer, mas não é certo,
            // pois o é o JVM que decide quando o Garbage Collector vai acontecer de fato
            System.out.println("A memória foi liberada.");
        } else if (array==null){
            System.out.println("A memória já foi liberada antes");
        }
    }

    public static void inserir(int pos, int valor) {
        try{
            if (verificarAlocado==true && pos>=0) {
                array[pos] = valor;
            }
        } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }

}
