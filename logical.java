public class logical {
    public static void main(String[] args) {
        System.out.println("For logical AND");
        boolean a = false;
        boolean b = true;
        if (a && b) {
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For logical OR");
        if (a || b) {
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For logical NOT");
        System.out.print("For not(a) is: ");
        System.out.println(!a);
        System.out.print("For not(b) is: ");
        System.out.println(!b);
    }
}
