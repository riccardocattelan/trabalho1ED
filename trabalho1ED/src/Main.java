import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PilhaQ1 pilha = new PilhaQ1();
        pilha.push(1);
        pilha.push(4);
        pilha.push(6);
        int topo=pilha.top();
        System.out.println(topo);
        pilha.push(3);
        pilha.pop();
        pilha.push(8);
        topo=pilha.top();
        System.out.println(topo);
        boolean vc=pilha.cheia();
        System.out.println(vc);
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        vc=pilha.vazia();
        System.out.println(vc);
    }
}
