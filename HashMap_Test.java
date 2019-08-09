// This Java file was made by: Abdul and Omran.

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class HashMap_Test {

   public static void main(String args[]) {

      System.out.println("Which numbers are even?  Let's find out!\n");

      /* Here we declare our HashMap, isEven. */
      HashMap <Integer, Boolean> isEven = new HashMap<Integer, Boolean>();

      /* Here we add elements to our HashMap isEven. */
      isEven.put(3, false);
      isEven.put(8, true);
      isEven.put(45, false);
      isEven.put(84, true);
      isEven.put(100, true);

      /* Here we display our content using Iterator. */
      Set set = isEven.entrySet();
      Iterator iterator = set.iterator();
      while (iterator.hasNext()) {
         Map.Entry mapEntry = (Map.Entry)iterator.next();
         System.out.print("Key is "+ mapEntry.getKey() + " and value is ");
         System.out.println(mapEntry.getValue() + ".\n");
      } // When a hashmap hashes a key, it's going to put its key value pairs in an order that IT sees fit, not the way you imagine.  This is a downside of using hashmaps.

      /* Here we get values based on key. */
      Boolean getBool = isEven.get(100);
      System.out.println("It's " + getBool + " that 100 is even.\n");

      /* Here we remove values based on key. */
      isEven.remove(3);
      System.out.println("Map key and values after removal: \n");
      iterator = set.iterator();
      while (iterator.hasNext()) {
         Map.Entry mapEntry = (Map.Entry)iterator.next();
         System.out.print("Key is "+ mapEntry.getKey() + " and value is ");
         System.out.println(mapEntry.getValue() + ".\n");
      }
   }
}
