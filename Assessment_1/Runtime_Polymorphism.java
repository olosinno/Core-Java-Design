public class Runtime_Polymorphism {
    public static void main(String[] args) {
        int value = 1;
        String string = "one";

        string = string.valueOf(value);
        System.out.println(string);
    }
}
