public class HEJ {
    public static void main(String[] args) {

        final int a = 3;
        int[] c = new int[a * 2];

        for (int i = c.length - 1; i > 0; i--) {
            c[i] = i;
            System.out.println(c[i]);
        }
    }


}




