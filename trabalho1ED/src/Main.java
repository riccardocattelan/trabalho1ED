import java.util.ArrayList;
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
            switch(opcao){
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
//        pilha.inserir();
//        pilha.inserir();
//        pilha.inserir();
//        String topo=pilha.top();
//        System.out.println(topo);
//        pilha.inserir();
//        boolean ver=pilha.verificacao();
//        System.out.println(ver);
//        pilha.deletar();
//        pilha.inserir();
//        topo=pilha.top();
//        System.out.println(topo);
//        boolean vaziaoun=pilha.vazia();
//        System.out.println(vaziaoun);
//        pilha.deletar();
//        pilha.deletar();
//        pilha.deletar();
//        pilha.deletar();
//        vaziaoun=pilha.vazia();
//        System.out.println(vaziaoun);
    }
}
