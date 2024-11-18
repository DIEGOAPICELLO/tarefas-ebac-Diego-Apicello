public class MapaHash {
    private static final int TAMANHO = 10;
    private int[] chaves;
    private int[] valores;

    public MapaHash() {
        chaves = new int[TAMANHO];
        valores = new int[TAMANHO];
        limpar();
    }

    private int funcaoHash(int chave) {

        double constanteKnuth = 0.618033988749895;
        return (int) (TAMANHO * ((chave * constanteKnuth) % 1));
    }

    public void inserir(int chave, int valor) {
        int indice = funcaoHash(chave);

        while (chaves[indice] != -1 && chaves[indice] != chave) {
            indice = (indice + 1) % TAMANHO;
        }
        chaves[indice] = chave;
        valores[indice] = valor;
    }

    public Integer obter(int chave) {
        int indice = funcaoHash(chave);

        while (chaves[indice] != -1) {
            if (chaves[indice] == chave) {
                return valores[indice];
            }
            indice = (indice + 1) % TAMANHO;
        }
        return null;
    }

    public Integer remover(int chave) {
        int indice = funcaoHash(chave);

        while (chaves[indice] != -1) {
            if (chaves[indice] == chave) {
                int valorRemovido = valores[indice];
                chaves[indice] = -1;
                valores[indice] = -1;
                return valorRemovido;
            }
            indice = (indice + 1) % TAMANHO;
        }
        return null;
    }

    public void limpar() {
        for (int i = 0; i < TAMANHO; i++) {
            chaves[i] = -1;
            valores[i] = -1;
        }
    }

    /**
     * Justificativa da Função Hash:
     *
     * Usa método de multiplicação de Knuth
     * Distribui chaves uniformemente
     * Reduz colisões
     *
     * Características:
     *
     * Tamanho fixo de 10 elementos
     * Suporta inserção, remoção, busca e limpeza
     */

}
