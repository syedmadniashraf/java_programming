import java.util.*;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user: ");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number 1");
        // int a = sc.nextInt();
        // System.out.println("Enter number 2");
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println("The sum of these numbers is: ");
        // System.out.println(sum);
        // boolean b1 = sc.hasNextInt();
        // String str = sc.next();  // Gives only first word
        String str = sc.nextLine(); // Gives a whole sentence
        // char ch = sc.nextLine().charAt(0);
        // System.out.println(ch);
        System.out.println(str);
    }
}
