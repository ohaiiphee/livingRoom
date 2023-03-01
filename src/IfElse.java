public class IfElse {
    public static void main(String[] args) {
        //On the bus you receive a discount if you are a senior citizen, a dog or a student

//        boolean isDog = false;
//        boolean isSenior = true;
//        boolean isStudent = false;


//         checkIfDiscount (isSenior, isStudent, isDog);
//        checkIfDiscount(true, true, true);
//        checkIfDiscount(true, false, true);
//        checkIfDiscount(false, true, false);
//        checkIfDiscount(false, true, true);
//        checkIfDiscount(false, false, false);


//        In a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book

        int nonFiction = 1;
        int fiction = 0;

        String result = checkIfBookDiscount(nonFiction, fiction);
        System.out.println(result);
        System.out.println(checkIfBookDiscount(12, 3));
        System.out.println(checkIfBookDiscount(1, 0));

    }

    public static void checkIfDiscount(boolean isSenior, boolean isStudent, boolean isDog) {
        if (isSenior) {
            System.out.println("Discount!");
        } else if (isDog) {
            System.out.println("Discount!");
        } else if (isStudent) {
            System.out.println("Discount!");
        } else {
            System.out.println("No Discount!");
        }
    }

    public static String checkIfBookDiscount(int nonFiction, int fiction) {
        String discount = "Discount!";
        String noDiscount = "No Discount!";


        if (nonFiction >= 3 && fiction > 0) {
            return discount;
        } else {
            return noDiscount;
        }
    }
}

