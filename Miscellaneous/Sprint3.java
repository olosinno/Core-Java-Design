public class Sprint3 {
    public static void main (String[] args) { // Write a Java program to count the number of even and odd elements in a given array of integers.
        int[] count = {5, 7, 2, 4, 9};
        int even = 0;
        int odd = 0;
        
        for (int i = 0; i<count.length; i++) {
            if (count[i] % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Number of even elements in the array: " + even);
        System.out.println("Number of odd elements in the array: " + odd);
    }
} // Finished in 3:01
