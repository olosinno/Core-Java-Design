// Write a Java program to check whether java is installed on your computer.  Expected output version, runtime version, home, vendor, vendor URL, class path.
public class Sprint1 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("java.class.path"));
    }
}
// Finished in 3:45