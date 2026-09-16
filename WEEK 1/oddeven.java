import java.util.Scanner;
    public class oddeven {
      public static void main (String [] args){
           Scanner input = new Scanner(System.in);
                System.out.println("Enter the Number : ");
                        int a = input.nextInt();
                            if (a % 2 == 0)
                                System.out.println( a + "is Even");
                            else
                                System.out.println( a + "is Odd");
 }
}