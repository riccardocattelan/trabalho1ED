public class PilhaQ1 {
    int[] elementos;
    int topo;

    public PilhaQ1(){
        elementos=new int[10];
        topo=-1; //-1 pelo motivo de que para adicionar um item, o topo vai ser topo++
        // (adicionado 1 casa decimal) para chegar ao 0, que é o começo, então precisa ser -1 no começo
    }
    public void push(int e){
        topo++;
        elementos[topo]=e;
    }
    public int pop(){
        int e;
        e=elementos[topo];
        topo--;
        return e;
    }
    public boolean cheia(){
        return (topo==9); //o número é 9 pois um array de 10 elementos vai do 0-9, sendo 9 o topo
    }
    public boolean vazia(){
        return (topo==-1);
    }
    public int top(){
        return (elementos[topo]);
    }


}
