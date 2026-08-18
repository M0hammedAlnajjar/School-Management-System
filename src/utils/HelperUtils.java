package utils;

public class HelperUtils {

    private static int counter = 1;
    public static boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    public static String generateId() {

        return "ID-" + (counter++);
    }
    public static String generateId(String prefix) {
        return prefix + "-" + (counter++);
    }

    public static boolean isPositive(int n) {
        return n > 0;
    }
    public static boolean isPositive(double n) {
        return n > 0;
    }

    public static boolean isValidNumber(double n, double min, double max) {
        return n >= min && n <= max;
    }

    // ---- isValidAge ----
    public static boolean isValidAge(int age) {
        return age >= 0 && age <= 120;
    }

    public static boolean isValidString(String s) {
        return !isEmpty(s);
    }
    public static boolean isValidString(String s, int minLength) {
        return !isEmpty(s) && s.trim().length() >= minLength;
    }
    public static boolean isValidString(String s, int min, int max) {
        return !isEmpty(s) && s.trim().length() >= min && s.trim().length() <= max;
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
        return value >= min && value <= max;
    }

}
