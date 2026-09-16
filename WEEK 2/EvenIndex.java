import java.util.Scanner;

class EvenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Elements at even index:");

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}