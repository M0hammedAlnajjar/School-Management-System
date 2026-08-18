package utils;
import java.util.Scanner;
public class HelperUtils {

    private static int counter = 1;
    public static boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    public static String generateId(String stu) {

        return stu;
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


    private static final Scanner scanner = new Scanner(System.in);

    public static double getDoubleInput(String prompt) {
        System.out.print(prompt + " ");

        while (!scanner.hasNextDouble()) {
            System.out.print("Please type a number: ");
            scanner.next();
        }

        double value = scanner.nextDouble();
        scanner.nextLine();

        return value;
    }
}
