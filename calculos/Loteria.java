import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Sorteio {
    public static Scanner teclado = new Scanner(System.in);
    public static Scanner input;
    public static int[] numSorteados = new int [6];
    public static int contador, posicao, num;

    public static void Loteria() {
        Random Sorteio = new Random();

        for (int i = 0; i < 6; i++) {
            numSorteados[i] = Sorteio.nextInt(60) + 1;
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
                for (num = 0; num == 6; num++){
                System.out.println("Seu prêmio é de R$1.000.000,00");
            }
                break;

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