public class Sprint3 {
    public static void main (String[] args) { // Write a Java program to take the last three characters from a given string and add the three characters at both the front and back of the string.
        String Python = "Python";
        String hon = Python.substring(3, 6);
        System.out.println(hon);

        StringBuilder sb = new StringBuilder();
        sb.append(hon);
        sb.append(Python);
        sb.append(hon);
        System.out.println(sb);
    }
} // Finished in 05:50
