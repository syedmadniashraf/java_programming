public class Ch_2_op_pre {
    public static void main(String[] args) {
        // int a = 6*5-34/2; // Highest precedence evaluate first
                        // Associativity defines the direction for operators of same level precedence to evaluate
        // System.out.println(a);

        // Quick Quiz
        int a = 10;
        int b = 0;
        int c = 0;
        int k = b*b -(4*a*c)/(2*a);
        System.out.println(k);
    }
}