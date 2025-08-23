package questao1;

//Riccardo André Cattelan - 202411140005
//Edivaldo Sousa Pinheiro - 202411140027

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PilhaQ1 pilha = new PilhaQ1();

        String resposta="s";
        while(resposta.equals("s")){
            System.out.printf("%nEscolha qual opção deseja: %n 1 - Inserir %n 2 - Deletar %n 3 - Verificar valor no topo" +
                    "%n 4 - Verificar se é palíndromo %n");
            int opcao=scanner.nextInt();
            scanner.nextLine();
            switch(opcao){ //o usuario vai escolher o que fazer no codigo
                case 1:
                    pilha.inserir();
                    break;
                case 2:
                    pilha.deletar();
                    break;
                case 3:
                    pilha.top();
                    break;
                case 4:
                    boolean verificar=pilha.verificacao();
                    System.out.println(verificar);
                    break;
            }
            System.out.printf("%n Deseja continuar? %n Sim - Digite 's' %n Não - Aperte Enter %n");
            resposta=scanner.nextLine();
        }
    }
}
