import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numCount = scanner.nextInt();
        int numPrint = 1;
        int numPrintCount = 0;
        do {
            for (var i = 0; i < numPrint; i++) {
                if (numPrintCount >= numCount) {
                    break;
                }
                System.out.print(numPrint + " ");
                numPrintCount++;

            }
            numPrint++;

        } while (numPrintCount < numCount);
    }
}