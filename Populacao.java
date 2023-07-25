public class Populacao {

    public static void main(String[] args) {
        int populacaoA = 90000000;
        double taxaCrescimentoA = 0.03;

        int populacaoB = 200000000;
        double taxaCrescimentoB = 0.015;

        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }

        System.out.println(
                "Após " + anos + " anos, a população do país A ultrapassará ou igualará a população do país B.");
    }
}
