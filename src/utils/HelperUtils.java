package utils;

public class HelperUtils {

    private static int counter = 1;
    public static boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }


    public String getStringInput(String prompt) {
    System.out.println(prompt+ " ");
    return prompt;
    }



    public static int getCounter(String stu) {
        return counter;
    }

    public static void setCounter(int counter) {
        HelperUtils.counter = counter;
    }

    public static boolean isValidNumber(int value, int min, int max) {

        return false;
    }
}
