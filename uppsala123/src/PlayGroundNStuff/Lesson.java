package PlayGroundNStuff;

public class Lesson {
    public static void main(String[] args) {
        doStuff();
    }

    public static int doStuff() {
        int[] numbers1 = {0,1,2,3};
        int[] numbers2 = {3,2,1,0};
        for(int i = 0; i< numbers1.length; i++) {
            numbers1[i] = numbers1[i] + 1;
        }
        numbers1 = numbers2;
        for(int i = 0; i < numbers2.length; i++) {
            numbers2[i] = numbers2[i] + 1;
        }
        return numbers1[0];
        }

    }
