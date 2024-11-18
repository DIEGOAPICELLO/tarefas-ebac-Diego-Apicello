public class FilaFIFO {

    public static class FilaPersonalizadaFIFO {
        private int[] elements;
        private int inicio;
        private int fim;
        private int tamanhoAtual;
        private static final int CAPACIDADE_PADRAO = 10;

        public FilaPersonalizadaFIFO() {
            elements = new int [CAPACIDADE_PADRAO];
            inicio = 0;
            fim = -1;
            tamanhoAtual = 0;
        }

        public void enfileirar (int element) {
            if (tamanhoAtual == elements.length) {
                int[] newArray = new int[elements.length * 2];

                for (int i = 0; i < tamanhoAtual; i++) {
                    newArray[i] = elements[(inicio + i) % elements.length];
                }
                elements = newArray;
                inicio = 0;
                fim = tamanhoAtual - 1;
            }

            fim = (fim + 1) % elements.length;
            elements[fim] = element;
            tamanhoAtual++;
        }

        public int desenfileirar() {
            if (estaVazia()) {
                throw new IllegalStateException("A Fila está vazia");
            }
            int elementRemoved = elements[inicio];
            inicio = (inicio +1) % elements.length;
            tamanhoAtual --;
            return elementRemoved;
        }

        public int rear() {
            if (estaVazia()) {
                throw new IllegalStateException("Fila está vazia");
            }
            return elements[fim];
        }

        public int front() {
            if (estaVazia()) {
                throw new IllegalStateException("Fila está Vazia");
            }
            return elements[inicio];
        }

        public int tamanho() {
            return tamanhoAtual;
        }

        public boolean estaVazia() {
            return tamanhoAtual == 0;
        }

    }




}
