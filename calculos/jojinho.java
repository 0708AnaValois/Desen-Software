import java.util.Random;
import java.util.Scanner;

public class jojinho {
    public static void main (String[] args) {
        int x, y, vidas = 10;
        Scanner teclado = new Scanner(System.in);
        Random dado = new Random();
        String perdeu = "";

        x = dado.nextInt(99) + 1;

        System.out.println("Digite um número: ");
        do {
            String dicas = "";
            y = teclado.nextInt();

            if (x > y) {
                dicas = "O número sorteado foi maior do que você digitou";
            }
            else if (x < y) {
                dicas = "O número sorteado foi menor do que você digitou";
            }
            else if (x == y) {
                dicas = "Você acertou!";
            }
            System.out.println("Você tem " + vidas + " vidas");
            vidas--;
            System.out.println(dicas);
        } while (vidas > 0);

        if (vidas == 0) {
            perdeu = "Você perdeu :(";
        }

        teclado.close();
    }
}
