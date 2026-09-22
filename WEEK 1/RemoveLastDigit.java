import java.util.Scanner;

class RemoveLastDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = num / 10;

        System.out.println("After removing last digit = " + num);
    }
}