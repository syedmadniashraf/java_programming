import java.util.Scanner;

public class Ch_01_PS {
    public static void main(String[] args) {
        // question 1

        int a = 4;
        int b = 7;
        int c = 5;
        int sum = a + b + c;
        System.out.println(sum);

        // Question 2

        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;
        float cgpa = (subject1 + subject2 + subject3)/30;
        System.out.println(cgpa);

        // Question 3
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);  // User se input lene ke lie ye likhte hai 
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");

        // Question 4

        System.out.println("Kilometer to miles:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Miles = " + miles);

        // Question 5

        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());            // sc.hasNextInt() // Check ki integer hai ya nahi 
                                                        // sc.hasNex() // Check kch bhi input hai ya nahi
    }                                                   // sc.hasNextDouble() // Check ki double hai ya nahi
}
