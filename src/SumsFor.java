public class SumsFor {
    public static void main(String[] args) {
        //we want the sum of 1+2+3+...+10
        int sum = 0;

        for (int i = 50; i <=100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        for (int i = 0; i < 5; i++) {
            System.out.println("Yay for loops are cool!");
        }
    }
}
