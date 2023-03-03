public class InfiniteLoops {
    public static void main(String[] args) {
        int i = 1;

        loop(i);


        loop2(i);
    }

    public static void loop(int i) {
        do {
            System.out.println(1);
            i--;
        } while (i == 1);

    }

    public static void loop2(int i) {
        while (i <= 3) {
            System.out.println(i);
            i++;

        }
    }
}
