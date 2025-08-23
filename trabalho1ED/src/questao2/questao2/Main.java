package questao2;

//Riccardo André Cattelan
//Edivaldo Sousa Pinheiro

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GCQ2 Gc = new GCQ2(); //criando objeto da classe
        System.out.print("Quantos números de blocos deseja alocar? ");// usuario escolhe numero de blocos para alocar
        int nBlocos = scanner.nextInt();
        scanner.nextLine();
        Gc.alocar(nBlocos);//chamando metodo para alocar a quantidade de blocos(ainda sem valores)

        if (Gc.verificarAlocado==true) {//se os blocos foram alocados, entao pode começcar a inserir os valores
            for (int i = 0; i < Gc.array.length; i++) {//para nao sair do range do array
                System.out.printf("%nInsira um inteiro para ser o elemento no index %d: ",
                        i);
                int valorInt= scanner.nextInt();
                scanner.nextLine();
                Gc.inserir(i, valorInt);//agora está inserindo os valores nos blocos alocados
            }
            int opcao=0;
            String resposta="s";
            while (resposta.equals("s")) {
                System.out.printf("%nQual opção deseja executar?%n1 - Exibir array%n2 - " +
                        "Verificar se está alocado%n3 - Liberar a memória%n");//pequeno menu para o usuario escolher a opção
                opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        Gc.exibir();//caso o usuario digitar 1, vai exibir os valores inseridos anteriormente
                        break;
                    case 2:
                        Gc.verificacao();//caso digitar 2, vai verificar se os blocos foram alocados
                        break;
                    case 3:
                        Gc.liberarMem();//caso digitar 3, vai ser executada a liberação da memória
                        break;
                }
                System.out.printf("%n Deseja continuar? %n Sim - Digite 's' %n Não - Aperte Enter %n");
                resposta = scanner.nextLine();
            }
        }
        scanner.close();
    }
}
