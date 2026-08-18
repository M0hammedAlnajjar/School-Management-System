package utils;

public class HelperUtils {

    private static int counter = 1;

    // Check if String is Empty
    public static boolean isEmpty(
            String value
    ) {

        return value == null
                || value.trim().isEmpty();
    }

    // Generate General ID
    public static String generateId() {

        return "ID-" + counter++;
    }

    // Generate ID Using Prefix
    public static String generateId(
            String prefix
    ) {

        return prefix
                + "-"
                + counter++;
    }

    // Check Positive Integer
    public static boolean isPositive(
            int number
    ) {

        return number > 0;
    }

    // Check Positive Double
    public static boolean isPositive(
            double number
    ) {

        return number > 0;
    }

    // Validate Double Number Range
    public static boolean isValidNumber(
            double number,
            double min,
            double max
    ) {

        return number >= min
                && number <= max;
    }

    // Validate Integer Number Range
    public static boolean isValidNumber(
            int value,
            int min,
            int max
    ) {

        return value >= min
                && value <= max;
    }

    // Validate Age
    public static boolean isValidAge(
            int age
    ) {

        return age >= 0
                && age <= 120;
    }

    // Validate String
    public static boolean isValidString(
            String value
    ) {

        return !isEmpty(value);
    }

    // Validate String Minimum Length
    public static boolean isValidString(
            String value,
            int minLength
    ) {

        return !isEmpty(value)
                && value.trim().length()
                >= minLength;
    }

    // Validate String Length Range
    public static boolean isValidString(
            String value,
            int minLength,
            int maxLength
    ) {

        return !isEmpty(value)
                && value.trim().length()
                >= minLength
                && value.trim().length()
                <= maxLength;
    }

    // Counter Getter
    public static int getCounter(
            String prefix
    ) {

        return counter;
    }

    // Counter Setter
    public static void setCounter(
            int counter
    ) {

        HelperUtils.counter = counter;
    }
}