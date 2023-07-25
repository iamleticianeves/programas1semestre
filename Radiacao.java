public class Radiacao {

    public static void main(String[] args) {
        double massaInicial = 1000.0;

        double massaFinal = 0.5;

        double tempoSegundos = calcTempo(massaInicial, massaFinal);

        int horas = (int) (tempoSegundos / 3600);
        int minutos = (int) ((tempoSegundos % 3600) / 60);
        int segundos = (int) (tempoSegundos % 60);

        System.out.println("Massa inicial: " + massaInicial + " gramas");
        System.out.println("Massa final: " + massaFinal + " gramas");
        System.out.println("Tempo necessário para decomposição: " + horas + " horas, " + minutos + " minutos, "
                + segundos + " segundos");
    }

    public static double calcTempo(double massaInicial, double massaFinal) {
        double tempoSegundos = 0;
        while (massaInicial > massaFinal) {
            massaInicial /= 2;
            tempoSegundos += 50;
        }
        return tempoSegundos;
    }
}
