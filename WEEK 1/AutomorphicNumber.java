import java.util.Scanner;

class AutomorphicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;

        if (square % 10 == num) {
            System.out.println("Automorphic Number");
        }
        else {
            System.out.println("Not an Automorphic Number");
        }
    }
}