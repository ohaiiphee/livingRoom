package TypeConversion;

public class Dividing {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter number: ");
//        int firstNumber = scanner.nextInt();
//
//        int secondNumber = 3;
//
//        int result = firstNumber % secondNumber;
//
//        if (result == 0) {
//            System.out.println("The number is divisible by 3");
//        } else {
//            System.out.println("The number is not divisible by 3");
//        }

        int dividend = 17;
        int divisor = 9;
        int resultOfDivisible = isDivisible(dividend, divisor);

        if (resultOfDivisible != 0) {
            System.out.println(dividend + " is divisible by " + divisor);
        }

        int dividend2 = 12;
        int divisor2 = 9;
        int resultOfDivisible2 = isDivisible2(dividend2, divisor2);

    }

    public static int isDivisible(int dividend, int divisor) {
        int restFromDivision = dividend % divisor;

        if (restFromDivision == 0) {
            return dividend;
        } else {
            return 0;
        }
    }

    public static int isDivisible2(int dividend, int divisor) {
        int restFromDivision = dividend % divisor;
        int returnValue = 0;
        if (restFromDivision == 0) {
            returnValue = dividend;
        }
        return returnValue;
    }
}
