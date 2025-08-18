import java.util.ArrayList;
import java.util.Scanner;

public class PilhaQ1 {
    ArrayList<String> elementos;
    int topo;

    public PilhaQ1() {
        elementos = new ArrayList<>();
        topo = -1; //-1 pelo motivo de que para adicionar um item, o topo vai ser topo++
        // (adicionado 1 casa decimal) para chegar ao 0, que é o começo, então precisa ser -1 no começo
    }

    public void inserir() {
        Scanner scanner = new Scanner(System.in);
        topo++;
        System.out.println("insira um valor");
        String valor = scanner.nextLine();
        elementos.add(valor);
    }

    public void deletar() {
        try {
            String valor = elementos.remove(topo);
            topo--;
            System.out.println("Valor deletado: " + valor);
        } catch (Exception e) {
            System.out.println("Erro: Pilha vazia. " + e.getMessage());
        }
    }

    public void top() {
        try {
            System.out.println("O valor no topo é: "+elementos.get(topo));
        } catch (Exception e) {
            System.out.println("Erro: Pilha vazia, não tem valor no topo. " + e.getMessage());
        }
    }

    public boolean verificacao() {
        int cont = 0;
        if (topo != -1) {
            while (cont < elementos.size() / 2) {
                if (!elementos.get(cont).equalsIgnoreCase(elementos.get(elementos.size() - 1 - cont))) {
                    return false;
                }
                cont++;
            }
            return true;
        } else {
            System.out.println("Pilha vazia! Não tem como fazer essa verificação");
            return false;
        }
    }

}
