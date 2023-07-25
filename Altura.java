import java.util.Scanner;

public class Altura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maiorAltura = 0;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturaMulheres = 0;
        double somaAlturaTurma = 0;
        int contadorMulheres = 0;

        for (int i = 1; i <= 50; i++) {
            System.out.println("Ficha " + i);
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.nextLine().charAt(0);

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (sexo == 'F') {
                somaAlturaMulheres += altura;
                contadorMulheres++;
            }

            somaAlturaTurma += altura;
        }

        double mediaAlturaMulheres = somaAlturaMulheres / contadorMulheres;
        double mediaAlturaTurma = somaAlturaTurma / 50;

        System.out.println("Maior altura da turma: " + maiorAltura + " metros");
        System.out.println("Menor altura da turma: " + menorAltura + " metros");
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres + " metros");
        System.out.println("Média de altura da turma: " + mediaAlturaTurma + " metros");
    }
}
