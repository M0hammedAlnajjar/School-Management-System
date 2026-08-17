package utils;

public class HelperUtils {

    private static int counter = 1;
    public static boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }








    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        HelperUtils.counter = counter;
    }
}
