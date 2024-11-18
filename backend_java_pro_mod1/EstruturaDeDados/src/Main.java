public class Main {
    public static void main(String[] args) {

        System.out.println("**********INICIO DA PILHA**********");
        Pilha.PilhaPersonalizada pilha = new Pilha.PilhaPersonalizada();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Tamanho da Pilha: " + pilha.tamanho());

        System.out.println("Elemento Removido: " + pilha.pop());
        System.out.println("Elemento Removido: " + pilha.pop());

        System.out.println("Tamanho atual da Pilha: " + pilha.tamanho() );

        System.out.println("Elemento que está no topo: " + pilha.top());

        try {
            while (!pilha.estaVazia()) {
                System.out.println("Removendo: " + pilha.pop());
            }
        }
        catch (IllegalStateException e){
            System.out.println("Pilha ficou vazia");
        }

        System.out.println("**********INICIO DA FILA FIFO**********");

        FilaFIFO.FilaPersonalizadaFIFO fila = new FilaFIFO.FilaPersonalizadaFIFO();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        System.out.println("Frente da Fila: " + fila.front());
        System.out.println("Fim da Fila: " + fila.rear());
        System.out.println("Tamanho da Fila: " + fila.tamanho());

        System.out.println("Removendo da Fila: " + fila.desenfileirar());
        System.out.println("Nova Frente: " + fila.front());

        System.out.println("**********INICIO DA LISTA ENCADEADA**********");

        ListaEncadeada.ListaEncadeadaPersonalizada lista = new ListaEncadeada.ListaEncadeadaPersonalizada();

        lista.adicionar(new ListaEncadeada.No(10));
        lista.adicionar(new ListaEncadeada.No(20));
        lista.adicionar(new ListaEncadeada.No(30));

        System.out.println("Lista inicial:");
        lista.imprimirLista();

        lista.inserir(1, new ListaEncadeada.No(15));
        System.out.println("Após inserir 15 no índice 1:");
        lista.imprimirLista();

        ListaEncadeada.No elementoIndice2 = lista.elementoPorIndice(2);
        System.out.println("Elemento no índice 2: " + elementoIndice2.valor);

        lista.remover(2);
        System.out.println("Após remover elemento do índice 2:");
        lista.imprimirLista();

        System.out.println("Tamanho da lista: " + lista.tamanho());

        System.out.println("**********INICIO MAPA DE HASH**********");

        MapaHash mapa = new MapaHash();

        mapa.inserir(5, 100);
        mapa.inserir(15, 200);

        System.out.println("Valor da chave 5: " + mapa.obter(5));

        mapa.remover(5);
        System.out.println("Após remoção, valor da chave 5: " + mapa.obter(5));


    }
}