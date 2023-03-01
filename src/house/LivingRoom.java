package house;

public class LivingRoom {
    public static void main(String[] args) {
        // squareMeters
        int squareMeters;
        // pricePerSquareMeter
        double pricePerSquareMeter;
        // address
        String address;

        squareMeters = 60;
        pricePerSquareMeter = 10.5;
        address = "Addressville 28";


        System.out.println("The house at " + address + " costs " + squareMeters*pricePerSquareMeter + "€");


    }
}
