import java.util.Scanner;

public class BinarioDecimal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número binário: ");
        String binario = entrada.nextLine();

        int decimal = BinarioDecimal(binario);
        System.out.println("O número decimal equivalente é: " + decimal);
    }

    public static int BinarioDecimal(String binario) {
        int decimal = 0;
        int power = 0;
        int index = binario.length() - 1;

        while (index >= 0) {
            int digit = Character.getNumericValue(binario.charAt(index));
            decimal += digit * Math.pow(2, power);
            power++;
            index--;
        }

        return decimal;
    }
}
