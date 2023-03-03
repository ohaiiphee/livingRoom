public class CountDown {
    public static void main(String[] args) {
        int x = 10;


        countdown(x);

        countdown(25);



    }

    public static void countdown (int x) {
        while (x >= 0) {
            System.out.println(x);
            x--;
        }
    }

}
