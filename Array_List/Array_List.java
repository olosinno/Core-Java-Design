import java.util.ArrayList; // import the ArrayList class from java.util package
import java.util.Collections;
import java.util.Random; // import the Random class

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<Integer>(); // create ArrayList named grades that stores integers

        grades.add(110); // add element to ArrayList
        System.out.println("Lil' Billy scored a perfect on the test with a " + grades.get(0) + "%!  A++");
        
        System.out.print("False alarm, Lil' Billy cheated on his test so his grade went from " + grades.get(0));
        grades.set(0, 0); // change element of ArrayList to 0 by index number (first 0 is index no., second is value)
        System.out.println(" to " + grades.get(0) + "%!");
        grades.remove(0); // remove element of ArrayList by index number
        grades.clear(); // clears ArrayList of all elements

        System.out.println("Lil' Billy has been expelled.  Now to grade the rest of the students...\n");

        Random randNo = new Random(); // declare/establish java.util.Random object
        grades.add(randNo.nextInt(90) + 10); // add an object to ArrayList grades, anywhere between 10 and 100
        grades.add(randNo.nextInt(90) + 10);
        grades.add(randNo.nextInt(90) + 10);
        grades.add(randNo.nextInt(90) + 10);
        grades.add(randNo.nextInt(90) + 10); // add fifth object to ArrayList Grades

        /* Use a do while loop to add 45 extra grade numbers to the ArrayList instead of re-typing line a bunch */
        int group_size = 1;
        do {
            grades.add(randNo.nextInt(90) + 10);
            group_size++;
        } while (group_size < 45);

        /* Create for loop to iterate through ArrayList and print all added random grade integers;
        size() method retrieves size of ArrayList i.e. how many elements are inside
        for (int iterator = 0; iterator < grades.size(); iterator++) {
            System.out.print(grades.get(iterator) + " ");
        }
        */

        /* Sort method of Collections class sorts numerically in ascending order,
        could be handy for locating median value among large groups of numbers */
        Collections.sort(grades);

        /* Create for-each loop to iterate throughout size of ArrayList;
        Rather than declare and initialize loop iterator variable, declare a variable of same
        type as base type of array/ArrayList, followed by a colon, which is then followed by the array name.
        Is more commonly used with Collections class ArrayList than array, less chance of OutOfBounds exceptions */
        for (int iterator : grades) System.out.print(iterator + " ");
    }
}
// compile with javac Array_List.java --release 8, run with java Array_List
