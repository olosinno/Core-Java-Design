abstract class Foliage {
    abstract int getHeight(); // All extending classes must have the getHeight function.
}
class Bush extends Foliage {
    int height = 12; // Bush is a class extending abstract and can include other data, unlike objects implementing interfaces.
    int getHeight() {
        return height;
    }
}
class Tree extends Foliage {
    int height = 60; // Tree is a class extending abstract and can include other data, unlike objects implementing interfaces.
    int getHeight() {
        return height;
    }
}

public class Abstract_Test {
    public static void main(String[]args) {
        Foliage f;
        f = new Bush();
        System.out.println("The common Lilac bush is about " + f.getHeight() + " feet (4 meters) tall.");
        f = new Tree();
        System.out.println("The average tree is about " + f.getHeight() + " feet (20 meters) tall.");
    }
}
