import java.util.Scanner;

class CountOccurrence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter the digit to count: ");
        int digitToFind = sc.nextInt();

        int count = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit == digitToFind) {
                count++;
            }

            num = num / 10;
        }

        System.out.println("Occurrence = " + count);
    }
}