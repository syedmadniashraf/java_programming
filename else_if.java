import java.util.Scanner;
public class else_if {
    public static void main(String[] args) {
        char var = 'd';
        switch (var) {
            case 'r':
                System.out.println("You are becoming an adult");
                break;
            case 'c':
                System.out.println("You are getting a job");
                break;
            case 'd':
                System.out.println("You are getting retired");
                break;
        
            default:
                System.out.println("Enjoy life");

        System.out.println("Thanks for using my code");
                
        }



        /* 
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        age = sc.nextInt();
        if (age>56) {
            System.out.println("You are experienced");
        }
        else if(age>46){
            System.out.println("You are semi experienced");
        }
        else if(age>36){
            System.out.println("You are semi semi experienced");
        }
        else{
            System.out.println("You are not eligible");
        }
        */

    }
}
