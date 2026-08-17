package utils;

import java.util.Scanner;

public class InputHandler {
    private String department;
    private int teachersManaged;
    private Scanner scanner = new Scanner(System.in);

    public int getIntInput(String prompt, int min, int max) {
        while (true) {
            int value = getIntInput(prompt);
            if (HelperUtils.isValidNumber(value, min, max)) {
                return value;
            }
            System.out.println("Please enter a number between " + min + " and " + max + ".");
        }
    }

    private int getIntInput(String prompt) {
        System.out.print(prompt + " ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            System.out.print(prompt + " ");
            scanner.next();
        }
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }
}