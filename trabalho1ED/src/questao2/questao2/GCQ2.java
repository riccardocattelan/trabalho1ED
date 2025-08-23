package questao2;

//Riccardo André Cattelan
//Edivaldo Sousa Pinheiro

import java.util.Scanner;

public class GCQ2 {
    static int[] array;
    static boolean verificarAlocado = false;//começa com false pois ainda não foram alocados os blocos de memória

    Scanner scanner = new Scanner(System.in);
    public static void verificacao() {//método para verificar se os blocos foram alocados
        if (verificarAlocado==true) {//a verificacao  positiva acontece caso a verificação der true (foi alocado)
            System.out.println("A memória já está alocada");
        } else {//caso der false (não foram alocados), então vai ser printado o aviso para o usuário
            System.out.println("A memória não está alocada");
        }
    }

    public static void alocar(int tamanho) {//é feito o alocamento da memória
        if (tamanho>0) {//verifica se nao for 0 para nao criar um array de tamanho menor que 0
            array=new int[tamanho];//criando o array com o tamanho informado
            verificarAlocado=true;//informação de que foram alocados os blocos (true)
            System.out.printf("Foram alocados %d blocos na memória", tamanho);
        } else {
            System.out.println("Erro: tamanho inválido");
        }
    }

    public static void exibir() {//são exibidos os valores que estão salvos na memória
        try {
            if (verificarAlocado == true && array!=null) {//vai ser feito caso o array nao tiver sido liberado antes e caso os blocos foram alocados
                int j = 0;//aux para o printf
                for (int num : array) {
                    System.out.printf("Index %d: valor %d%n", j, num);//printa os valores junto com o index do array (j)
                    j++;
                }
            } else if (array==null) {//caso o array tiver sido liberado anteriormente vai aparecer o aviso para o usuário
                System.out.println("Array está vazio");
            }
        } catch (Exception e) {//tratamento de possíveis erros
            System.out.println(e.getMessage());
        }
    }

    public static void liberarMem() {//método para liberar memória
        if (verificarAlocado==true) {//verifica se ja tinha sido alocado anteriormente, para fazer a liberação
            verificarAlocado = false;
            array = null; //deixando o array sem utilidade, para o Garbage Collector limpar
            System.gc(); //chamando o Garbage Collector só como forma de incentivar o GB a acontecer, mas não é certo,
            // pois o é o JVM que decide quando o Garbage Collector vai acontecer de fato
            System.out.println("A memória foi liberada.");
        } else if (array==null){//verificacao para caso nao tiver blocos de memoria alocados (tiver sido limpo anteriormente)
            System.out.println("A memória já foi liberada antes");
        }
    }

    public static void inserir(int pos, int valor) {//método para inserir os valores
        try{
            if (verificarAlocado==true && pos>=0) {//verifica se os blocos foram alocados e se a posicao for maior ou igual a 0
                array[pos] = valor;//insere o valor na posicao do array
            }
        } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }

}
