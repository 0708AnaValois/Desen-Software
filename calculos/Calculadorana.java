import java.util.Scanner;

public class Calculadorana {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double numero_uno;
        double numero_duo;
        double numero_trois = 0;
        int a;
        int b = 0;

        System.out.println("Digite o ptimeiro valor: ");
        numero_uno = in.nextDouble();
        do {
            System.out.println("Digite o segundo valor: ");
            numero_duo = in.nextDouble();

            System.out.println("Digite 1 para somar, 2 para subtrair, 3 para multiplicar, 4 para dividir e 0 para sair: ");
            a = in.nextInt();
            
            switch (a) {
                case 1:
                   numero_trois = numero_uno + numero_duo;
                   System.out.println("A soma é: " + numero_trois + "/n");
                   b = in.nextInt();
                    break;
            
                case 2:
                    numero_trois = numero_uno - numero_duo;
                    System.out.println("A substração é: " + numero_trois + "/n");
                    b = in.nextInt();
                    break;

                case 3:
                    numero_trois = numero_uno * numero_duo;
                    System.out.println("A multiplicação é: " + numero_trois + "/n");
                    b = in.nextInt();
                    break;

                case 4:
                    numero_trois = numero_uno / numero_duo;
                    System.out.println("A divisão é: " + numero_trois + "/n");
                    b = in.nextInt();
                    break;

                default:
                    System.out.println("Operação finalizada.");
                    break;
            }

            if (b == 2) {
                System.out.println("Digite um valor: ");
                numero_uno = in.nextInt();
            }
            else if (b == 1) {
                numero_uno = numero_trois;
            }
            else {
                a = b;
            }
         } while (a == 1 | a == 2 | a == 3 | a == 4);
    }
}