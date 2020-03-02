import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        float percent = scanner.nextFloat();
        int target = scanner.nextInt();
        float result = money;
        int year = 0;

        while(result < target) {
            result *= (1+(percent/100));
            year++;
        };
        System.out.println(year);
    }
}