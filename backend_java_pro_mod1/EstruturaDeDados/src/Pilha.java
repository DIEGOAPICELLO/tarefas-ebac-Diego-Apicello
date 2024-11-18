public class Pilha {

    public static class PilhaPersonalizada {
        private int [] elements;
        private int topo;
        private static final int CAPACIDADE_PADRAO = 10;

        public PilhaPersonalizada() {
            elements = new int[CAPACIDADE_PADRAO];
            topo = -1;
        }

        public void push (int element) {
            if (topo == elements.length - 1) {
                int[] newArray = new int [elements.length * 2];
                System.arraycopy(elements, 0, newArray, 0, elements.length);
                elements = newArray;
            }
            topo++;
            elements[topo] = element;
        }

        public int pop() {

            if(estaVazia()) {
                throw new IllegalStateException("Pilha está vazia");
            }
            int elementRemoved = elements[topo];
            topo --;
            return elementRemoved;
        }

        public boolean estaVazia() {
            return topo == -1;
        }

        public int tamanho() {
            return  topo + 1;
        }

        public int top() {
            if (estaVazia()) {
                throw new IllegalStateException("Pilha está vazia");
            }
            return elements[topo];
        }


    }
}
