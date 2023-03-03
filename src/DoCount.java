public class DoCount {
    public static void main(String[] args) {
        int x;

        countUp(80);
    }
    public static void countUp (int x) {
        do {
            System.out.println(x);
            x++;
        } while (x <=100);

    }
}
