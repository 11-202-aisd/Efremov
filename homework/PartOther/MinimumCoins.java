package homework.PartOther;

import java.util.Scanner;
public class MinimumCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        int sum = scanner.nextInt();
        int[] coins = {1, 4, 5};
        int[] minCoins = new int[sum + 1];
        minCoins[0] = 0;
        for (int i = 1; i <= sum; i++) {
            minCoins[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i && minCoins[i - coins[j]] + 1 < minCoins[i]) {
                    minCoins[i] = minCoins[i - coins[j]] + 1;
                }
            }
        }
        System.out.println("Минимальное количество монет: " + minCoins[sum]);
    }
}
