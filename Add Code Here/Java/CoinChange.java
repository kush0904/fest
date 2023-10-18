
import java.util.Arrays;

public class CoinChange {

    public static int minCoins(int[] denominations, int amount){

        int size = denominations.length;
        Arrays.sort(denominations);

        int coinCount = 0;

        for(int i = size - 1; i>=0; i--){
            while (amount>=denominations[i]){
                System.out.print(denominations[i] + " ");
                amount-=denominations[i];
                coinCount++;
            }
        }
        System.out.println();

        return coinCount;
    }

    public static void main(String[] args) {
        int[] denominations = {1,2,5,10,20,25,50,100};
        int amount = 87;

        int minCoins = minCoins(denominations, amount);
        System.out.println("Minimum number of coins: " + minCoins);
    }
}
