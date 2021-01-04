package PlayGroundNStuff;

public class Play {

    public static class Dog {
        String name;
        int age;

        String play() {
            return "I think I'm playing atm?";
        }

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;

        }
    }
    public static void main(String[] args) {
        int size = 27;
        String name = "Fido";
        Dog myDog = new Dog("Fikus", 27);
      
        System.out.println("Hello my name is " + myDog.name + ". And I am " + myDog.age + "" +
                " years old. ");
        System.out.println(myDog.play());

    }
}
