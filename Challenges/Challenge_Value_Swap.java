class Value_Swap {
/* Being conservative with object memory usage is an important skill for any programmer.
Swap the values of two variables without creating a third variable. */
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 3;
        System.out.println("First number starts as " + num1 + ".  Second number starts as " + num2 + ".");
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("First number ends as " + num1 + ".  Second number ends as " + num2 + ".");
    }
}
