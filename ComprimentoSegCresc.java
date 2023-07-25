public class ComprimentoSegCresc {

    public static int calcComprimentoMax(int[] sequencia) {
        int comprimentoAtual = 1;
        int comprimentoMax = 1;

        for (int i = 1; i < sequencia.length; i++) {
            if (sequencia[i] > sequencia[i - 1]) {
                comprimentoAtual++;
            } else {
                comprimentoAtual = 1;
            }

            if (comprimentoAtual > comprimentoMax) {
                comprimentoMax = comprimentoAtual;
            }
        }

        return comprimentoMax;
    }

    public static void main(String[] args) {
        int[] sequencia = { 10, 23, 24, 25, 39, 31, 24, 25, 26, 27, 28, 29, 30 };
        int comprimentoMax = calcComprimentoMax(sequencia);
        System.out.println("O comprimento máximo do segmento crescente é " + comprimentoMax);
    }
}
