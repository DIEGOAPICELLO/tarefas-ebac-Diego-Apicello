public class ListaEncadeada {

    public static class No {
        int valor;
        No proximo;

        public No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    public static class ListaEncadeadaPersonalizada {
        private No cabeca;
        private int tamanho;

        public ListaEncadeadaPersonalizada() {
            this.cabeca = null;
            this.tamanho = 0;
        }

        public void adicionar(No no) {
            if (cabeca == null) {
                cabeca = no;
            } else {
                No atual = cabeca;
                while (atual.proximo != null) {
                    atual = atual.proximo;
                }
                atual.proximo = no;
            }
            tamanho++;
        }

        public No remover() {
            if (cabeca == null) {
                return null;
            }

            if (tamanho == 1) {
                No removido = cabeca;
                cabeca = null;
                tamanho--;
                return removido;
            }

            No atual = cabeca;
            while (atual.proximo.proximo != null) {
                atual = atual.proximo;
            }

            No removido = atual.proximo;
            atual.proximo = null;
            tamanho--;
            return removido;
        }

        public void inserir(int indice, No no) {
            if (indice < 0 || indice > tamanho) {
                throw new IndexOutOfBoundsException("Índice inválido");
            }

            if (indice == 0) {
                no.proximo = cabeca;
                cabeca = no;
            } else {
                No atual = cabeca;
                for (int i = 0; i < indice - 1; i++) {
                    atual = atual.proximo;
                }
                no.proximo = atual.proximo;
                atual.proximo = no;
            }
            tamanho++;
        }

        public void remover(int indice) {
            if (indice < 0 || indice >= tamanho) {
                throw new IndexOutOfBoundsException("Índice inválido");
            }

            if (indice == 0) {
                cabeca = cabeca.proximo;
            } else {
                No atual = cabeca;
                for (int i = 0; i < indice - 1; i++) {
                    atual = atual.proximo;
                }
                atual.proximo = atual.proximo.proximo;
            }
            tamanho--;
        }

        public No elementoPorIndice(int indice) {
            if (indice < 0 || indice >= tamanho) {
                throw new IndexOutOfBoundsException("Índice inválido");
            }

            No atual = cabeca;
            for (int i = 0; i < indice; i++) {
                atual = atual.proximo;
            }
            return atual;
        }

        public int tamanho() {
            return tamanho;
        }

        public void imprimirLista() {
            No atual = cabeca;
            while (atual != null) {
                System.out.print(atual.valor + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }
    }
}
