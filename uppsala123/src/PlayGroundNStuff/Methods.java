package PlayGroundNStuff;

public class Methods {
    public static void main(String[] args) {
        sayHelloWorld();

        sayHelloTo("Benjamin");
        sayHelloTo("Ida");
        int x = returnFive();
        System.out.println(x);

        int result = square(returnFive());
        System.out.println(result);
    }

    /**
     *
     * @param x ÄR EN VARIABLE SOM ÄR EN INT
     * @return Returnerar kvadraten av variablen x
     */
    static int square(int x) {
        return x * x;
    }

    // This method returns an int type with the value 5
    static int returnFive() {
        return 5;
    }
    // This method will say helo to whatever name is passed when called
    static void sayHelloTo(String name) {
        System.out.println("Hello, " + name);
    }
    // This method simply says "Hello World!"
    static void sayHelloWorld() {
        System.out.println("Hello World!");
    }

}
