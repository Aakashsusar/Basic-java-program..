public class Swapwithout {
    public static void main(String[] args) {
        int a = 65;
        int b = 45;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("value of a:" + a);
        System.out.println("Value of b:" + b);

    }

}
