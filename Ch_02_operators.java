public class Ch_02_operators {
    public static void main(String[] args) {
        int a = 4;
        // int b = 6 % a; // Modulo operator
        // 4.1 % 1.1 --> Returns Decimal Remainder
        int b = 9;
        b *= 3;  // Assignment operator
        System.out.println(b);
        System.out.println(64 > 6); // comparison operator
        // Logical operators
        System.out.println(64>6 && 64>98);// AND Operator
        System.out.println(64>6 || 64>98);// OR Operator
        System.out.println(2 & 3); // Bitwise operator
    }
}
