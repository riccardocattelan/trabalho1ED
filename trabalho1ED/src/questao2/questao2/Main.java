package questao2;

//Riccardo André Cattelan
//Edivaldo Sousa Pinheiro

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GCQ2 Gc = new GCQ2();
        System.out.print("Quantos números de blocos deseja alocar? ");
        int nBlocos = scanner.nextInt();
        scanner.nextLine();
        Gc.alocar(nBlocos);

        if (Gc.verificarAlocado==true) {
            for (int i = 0; i < Gc.array.length; i++) {
                System.out.printf("%nInsira um inteiro para ser o elemento no index %d: ",
                        i);
                int valorInt= scanner.nextInt();
                scanner.nextLine();
                Gc.inserir(i, valorInt);
            }
            int opcao=0;
            String resposta="s";
            while (resposta.equals("s")) {
                System.out.printf("%nQual opção deseja executar?%n1 - Exibir array%n2 - " +
                        "Verificar se está alocado%n3 - Liberar a memória%n");
                opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        Gc.exibir();
                        break;
                    case 2:
                        Gc.verificacao();
                        break;
                    case 3:
                        Gc.liberarMem();
                        break;
                }
                System.out.printf("%n Deseja continuar? %n Sim - Digite 's' %n Não - Aperte Enter %n");
                resposta = scanner.nextLine();
            }
        }
        scanner.close();
    }
}
