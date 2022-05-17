import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Sorteiana {
    public static Scanner teclado = new Scanner(System.in);
    public static Scanner input;
    public static int[] numSorteados = new int [6];
    public static int contador, posicao, num;

    public static void Loteria() {
        Random Sorteiana = new Random();
        int i = 1;

        for (int j = 0; j < 6; j++) {
            numSorteados[i] = Sorteiana.nextInt(60) + 1;
        }
    }
    public static int lerNum(int num) {
        for (int i = 0; i < 6; i++) {
            if (num == numSorteados[i]){
                return i;
            }
        } 
        return -1;
    }
    public static void main (String[] args) {
        int num;
        input = new Scanner(System.in);
        Loteria();

        do {
            System.out.println("Insira o número desejado: ");
            num = input.nextInt();
            num = teclado.nextInt();
            posicao = lerNum(num);

            if (posicao > 0) {
                System.out.println("Número foi encontrado" + posicao);
            }
            else {
                System.out.println("Número não encontrado");
            }
            System.out.println(Arrays.toString(numSorteados));

        } while (posicao <= 0);

        input.close();
        teclado.close();
    } 
}