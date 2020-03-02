import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int maxHeight = scanner.nextInt();
        int bridgesCount = scanner.nextInt();
        boolean found = false;
        for (var i = 0; i < bridgesCount; i++) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= maxHeight) {
                System.out.println("Will crash on bridge " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Will not crash");
        }
    }
}