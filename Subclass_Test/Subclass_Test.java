public class Subclass_Test {
    public static void main(String[] args) {
        Onion.onion_method();
        Cut.cut_method();
        Cook.cook_method();
        Success.success_method();
    }
}

class Onion {
    static StringBuilder sb = new StringBuilder();
    public static void onion_method() {
        String onion = "I have an onion.  ";
        sb.append(onion);
    }
}

class Cut extends Onion {
    public static void cut_method() {
        String cut = "I have cut the onion!  ";
        sb.append(cut);
    }
}

class Cook extends Onion {
    public static void cook_method() {
        String cook = "I have fried the onion!  ";
        sb.append(cook);
    }
}

class Success extends Onion {
    public static void success_method() {
        String success = "Together, we have cooked onion!";
        sb.append(success);
        System.out.println(sb);
    }
}
