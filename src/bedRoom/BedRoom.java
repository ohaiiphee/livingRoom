package bedRoom;

public class BedRoom {
    public static void main(String[] args) {
        //window size
        double windowSize;
        //posters on the wall
        int postersRight;
        int postersLeft;
        int totalPosters;
        //who sleeps there
        String name;

        windowSize = 2.8;
        postersRight = 11;
        postersLeft = 17;
        totalPosters = postersLeft + postersRight;
        name = "Maria";

        System.out.println(name + "´s bedroom has a really big window - it´s " + windowSize + "m big! She also has " + totalPosters + " posters on the wall. " + postersLeft + " posters are left of the window and " + postersRight + " are to the right.");
    }
}
