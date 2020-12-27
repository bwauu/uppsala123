import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        1. The code "Shirt s = new Shirt();" down below
        is the way how you create an object in java!

        2. So we have the default constructor "Shirt()" that has variables (attributes)
        and methods (function in a class). A methods in objects are things the
        object can perform/do.

        3. In the class "Shirt" there is a method called putOn().
        Inside the putOn() --> public static void putOn(){
        System.out.println("Shirt is on!");
        }
        4. Summary "Shirt s = new Shirt();"
        - There is a Shirt object that is called s
        - s is going to be equal to new Shirt()
        - new Shirt(); is going to make a new Shirt object.

        Take away: Constructors make new objects
        The constructor also have parentheses as methods like putOn().
        However, the constructor is a basically a method that makes your object.
        All methods have parentheses after them
         */
        Shirt s = new Shirt("White", 'M');

        System.out.println(s.color);
        System.out.println(s.size);
    }
}