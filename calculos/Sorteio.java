import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;

public class Sorteio {

    public static Scanner teclado = new Scanner(System.in);
    public static Scanner input;
    public static List numSorteados = new ArrayList<>();
    public static int contador, num, posicao;


    public static void Loteria() {
        Random Sorteio = new Random();

        for (int i = 0; i <= 5; i++) {
            numSorteados.add(Sorteio.nextInt(60));
            System.out.println(numSorteados);
        }
    }



    public static void main(String[] args) {
        int num;
        input = new Scanner(System.in);
        Loteria();
        List numInseridos = new ArrayList<>();


        do {

            for (int i = 0; i <= 5; i++) {
                System.out.println("Insira o número desejado: ");
                num = teclado.nextInt();
                if (num > 60) {
                    System.out.println("insira um número abaixo de 60");
                } else {
                    numInseridos.add(num);

                }

            }
    
            List numAcertos = new ArrayList<>();

        for (int i = 0; i < numSorteados.size(); i++) {
            for (int j = 0; j < numInseridos.size(); j++) {
                if (numInseridos.get(i) == numSorteados.get(j)) {
                    numAcertos.add(numInseridos);
                }
            }

        }



            switch (numAcertos.size()) {
                case 6:
                    System.out.println("6 acertos: R$ 1.000.000,00");
                    posicao = 1;
                    break;
              
                case 5:
                    System.out.println("5 acertos: R$ 250.000,00");
                   posicao = 1;
                    break;
                case 4:
                    System.out.println("4 acertos: R$ 50.000,00");
                   posicao = 1;
                    break;
                case 3:
                    System.out.println("3 acertos: nada.");
                   posicao = 1;
                    break;
                case 2:
                    System.out.println("2 acertos: nada.");
                   posicao = 1;
                    break;
                default:
                    System.out.println("1 acerto: nada.");
                   posicao = 1;
                    break;
            }
            

}while (posicao <= 0);
        System.out.println("Fim das apostas.");
        input.close();
        teclado.close();
    } 
}