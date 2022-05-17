import java.util.Scanner;

    public class calculadora {

        public static void main(String[] args) {
            double numero1, numero2, resultado;
            Scannner leia = new Scanner (System.in);

            numero1 = leia.nextDouble();
            System.out.printf("Digite o primeiro numero ");

            numero2 = leia.nextDouble();
            System.out.printf("Digite o segundo numero ");

            


            Scanner entrada = new Scanner(System.in);

            int a = 5;
            int b = 25;
            int soma = 0;

            System.out.print("Digite o primeiro numero ");
            a = entrada.nextInt();

            System.out.print("Digite o segundo numero ");
            b = entrada.nextInt();

            soma = a + b;

            System.out.printf("A soma é %d", soma);
        }

        public double subtracao (double numero1, double numero2) {
            double = resultado;
            rsultado = numero1 - numero2;
            System.out.printf("A subtração é:");
        }

        public double divisao (double numero1, double numero2) {
            double = resultado;
            resultado = numero1/numero2;
            System.out.printf("A divisao é:", total);
            int total = numero1 / numero2; 
        }
        
        public double multiplicacao (double numero1, double numero2) {
            double = resultado;
            resultado = numero1*numero2;
            System.out.printf("A multiplicação é: ");
        }




