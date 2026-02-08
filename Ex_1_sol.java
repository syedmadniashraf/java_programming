// Calculate the percentage of 5 subjects

import java.util.Scanner;
public class Ex_1_sol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Physics marks:");
        int Physics = scan.nextInt();
        System.out.println("Enter your Chemistry marks:");
        int Chemistry = scan.nextInt();
        System.out.println("Enter your Maths marks:");
        int Maths = scan.nextInt();
        System.out.println("Enter your English marks:");
        int English = scan.nextInt();
        System.out.println("Enter your Computer Science marks:");
        int Computer_Science  = scan.nextInt();

        float Percentage = ((Physics + Chemistry + Maths + English + Computer_Science)/500.0f)*100;
        
        System.out.println("Percentage: ");
        System.out.println(Percentage);
    }
}
