package questao1;

//Riccardo André Cattelan
//Edivaldo Sousa Pinheiro

import java.util.ArrayList;
import java.util.Scanner;

public class PilhaQ1 {
    ArrayList<String> elementos;
    int topo;

    public PilhaQ1() { //metodo construtor para inserir o topo (controlar se ta vazio) e 
        // o arraylist (onde vai ter os valores)
        elementos = new ArrayList<>();
        topo = -1; //é -1 pois quando adicionado o primeiro item, o topo vai chegar ao index 0 (vai ser feito topo++), 
        //sendo que 0 é de fato o q deveria ser o começo. Se comecasse com 0, quando adicionado o primeiro item, 
        // o topo seria logo 1, pulando o index 0
    }

    public void inserir() {
        Scanner scanner = new Scanner(System.in);
        topo++; //caso for o primeiro item, o topo vai ser 0 (-1 -> 0, comeco do arraylist) e adicionado um valor, 
        // depois vai ser index 1 e adicionado um valor, e assim continua
        System.out.println("insira uma letra"); //usuario vai inserir o valor a ser adicionado no topo
        String valor = scanner.nextLine();
        elementos.add(valor); //adicionando valor no novo index
    }

    public void deletar() {
        try { //esse tratamento de erro é para quando o usuario tentar deletar um item em uma pilha vazia (sem item)
            String valor = elementos.remove(topo); //aqui vai remover o valor no topo e retornar na variavel 'valor'
            topo--; //o topo vai perder uma posicao, ja que vai ser removido o item
            System.out.println("Valor deletado: " + valor);
        } catch (Exception e) {
            System.out.println("Erro: Pilha vazia. " + e.getMessage());
        }
    }

    public void top() {
        try { //esse tratamento é para quando o usuario tentar ver o valor no topo sendo que a pilha está vazia
            System.out.println("O valor no topo é: "+elementos.get(topo)); //o get.() vai pegar o valor no ultimo index
        } catch (Exception e) {
            System.out.println("Erro: Pilha vazia, não tem valor no topo. " + e.getMessage());
        }
    }

    public boolean verificacao() {
        int cont = 0; //o contador vai percorrer todos os index para comparar seus valores
        if (topo != -1) { //aqui vai verificar se nao é uma pilha vazia, no caso o topo sendo igual o começo da pilha vazia (-1)
            while (cont < elementos.size() / 2) { //o cont vai percorrer metade do arraylist,
                // ou seja se tiver, por exemplo, 7 valores, vai comparar os valores 1-7, 2-6 e o 3-5,
                // mesmo sendo um arraylist de tamanho par ou impar
                if (!elementos.get(cont).equalsIgnoreCase(elementos.get(elementos.size() - 1 - cont))) { //vai percorrer o
                    // primeiro item e comparar com o ultimo, depois o segundo item e comparar com o penultimo,
                    // e assim continua
                    return false; //caso der alguma diferenca entre os valores opostos, vai retornar falso,
                    // ou seja nao é um palíndromo
                }
                cont++;
            }
            return true; //caso nao houver nenhuma divergencia, entao retorna true (é palíndromo)
        } else { //caso a pilha estiver vazia (inicio -1 e topo -1), vai retornar mensagem de erro
            System.out.println("Pilha vazia! Não tem como fazer essa verificação");
            return true; //retorna que é um palíndromo, já que é uma pilha vazia
        }
    }

}
