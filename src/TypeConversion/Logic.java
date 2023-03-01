package TypeConversion;

public class Logic {
    public static void main(String[] args) {
        //The sun is shining AND it is raining
        boolean sunShine= false;
        boolean rain = true;

        System.out.println(sunShine && rain);

//        This exercise confuses me Or I know exactly what this is about
        boolean confusion = true;
        boolean knowledge = false;

        System.out.println(confusion || knowledge);

//        (1 > 3 AND (NOT 3 - 1 < 5)) OR 2 * 2 == 4
        boolean result = 1 > 3 && (! (3 - 1 < 5)) || 2 * 2 == 4;
        System.out.println(result);


        //(6 >= 2*3 || 2-3 < 0) && (1*1 == 1 && 1 != 1+1)
        System.out.println((6 >= 2*3 || 2-3 < 0) && (1*1 == 1 && 1 != 1+1));






    }
}
