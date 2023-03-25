import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                 Scanner input = new Scanner(System.in);
                int[] coins = new int[12];
                int group1Sum, group2Sum, group3Sum;

                // Ler o peso de cada moeda
                System.out.println("Insira o peso de cada moeda:");
                for (int i = 0; i < 12; i++) {
                    System.out.print("Moeda " + (i+1) + ": ");
                    coins[i] = input.nextInt();
                }

                // Pesagem 1
                group1Sum = coins[0] + coins[1] + coins[2] + coins[3];
                group2Sum = coins[4] + coins[5] + coins[6] + coins[7];
                group3Sum = coins[8] + coins[9] + coins[10]+ coins[11];

                if (group1Sum == group2Sum){
                    int newgroup1 = coins[0]+ coins[1];
                    int newgroup2= coins[8] + coins[9];

                    if (newgroup1 != newgroup2){
                        if (coins[8] == coins[0]){
                            System.out.println("a moeda falsa e 10");
                        }else {
                            System.out.println("a moeda falsa e 9");
                        }

                    }
                    //vamos continuar de acordo com o video
                } else if (group1Sum>=group2Sum) {
                    int newgroup1 = coins[4]+ coins[5];
                    int newgroup2= coins[6] + coins[7];
                }

    }
}