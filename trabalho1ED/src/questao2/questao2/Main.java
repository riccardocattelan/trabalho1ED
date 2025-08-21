package questao2;

import java.util.Scanner;



//      EAI EDICRAZY, ESTE CÓDIGO FOI FEITO POR IA, SO SERVE COMO BASE INICIAL. EU ADICIONEI O System.gc() MAS PODE -
//           - DELETAR SE QUISER


public class Main {
    static int[] array;
    static boolean alocado = false;

    public static void alocarMemoria(int tamanho) {
        if (tamanho > 0) {
            array = new int[tamanho];
            alocado = true;
            System.out.println("Memória de " + tamanho + " blocos alocada.");
        } else {
            System.out.println("Erro: tamanho inválido.");
        }
    }

    public static void inserirItem(int pos, int valor) {
        if (alocado && pos >= 0 && pos < array.length) {
            array[pos] = valor;
        } else {
            System.out.println("Erro ao inserir.");
        }
    }

    public static void exibirArray() {
        if (alocado) {
            for (int i : array) System.out.print(i + " ");
            System.out.println();
        } else {
            System.out.println("Nenhuma memória alocada.");
        }
    }

    public static void liberarMemoria() {
        if (alocado) {
            array = null; //deixando o array sem utilidade, para o Garbage Collector limpar
            alocado = false;
            System.gc(); //chamando o Garbage Collector só como forma de incentivar o GB a acontecer, mas não é certo,
            // pois o é o JVM que decide quando o Garbage Collector vai acontecer de fato
            System.out.println("Memória liberada.");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de blocos: ");
        int n = sc.nextInt();
        alocarMemoria(n);

        if (alocado) {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Elemento ["+i+"]: ");
                inserirItem(i, sc.nextInt());
            }
            exibirArray();
            liberarMemoria();
        }
        sc.close();
    }
}
