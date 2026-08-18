package utils;

import java.util.Scanner;

public class InputHandler {

    private static final Scanner scanner =
            new Scanner(System.in);

    // =========================
    // READ INTEGER WITH RANGE
    // =========================

    public int getIntInput(
            String prompt,
            int min,
            int max
    ) {

        while (true) {

            int value =
                    getIntInput(prompt);

            if (HelperUtils.isValidNumber(
                    value,
                    min,
                    max
            )) {

                return value;
            }

            System.out.println(
                    "Please enter a number between "
                            + min
                            + " and "
                            + max
                            + "."
            );
        }
    }

    // =========================
    // READ INTEGER
    // =========================

    public int getIntInput(
            String prompt
    ) {

        System.out.print(
                prompt + " "
        );

        while (!scanner.hasNextInt()) {

            System.out.println(
                    "Invalid input. "
                            + "Please enter a valid number."
            );

            System.out.print(
                    prompt + " "
            );

            scanner.next();
        }

        int value =
                scanner.nextInt();

        scanner.nextLine();

        return value;
    }

    // =========================
    // READ STRING
    // =========================

    public String getStringInput(
            String prompt
    ) {

        System.out.print(
                prompt + " "
        );

        return scanner.nextLine();
    }

    // =========================
    // READ DOUBLE
    // =========================

    public static double getDoubleInput(
            String prompt
    ) {

        System.out.print(
                prompt + " "
        );

        while (!scanner.hasNextDouble()) {

            System.out.println(
                    "Invalid input. "
                            + "Please enter a valid number."
            );

            System.out.print(
                    prompt + " "
            );

            scanner.next();
        }

        double value =
                scanner.nextDouble();

        scanner.nextLine();

        return value;
    }

    // =========================
    // READ YES OR NO
    // =========================

    public boolean getConfirmation(
            String prompt
    ) {

        System.out.print(
                prompt + " (yes/no) "
        );

        String answer =
                scanner.nextLine()
                        .trim()
                        .toLowerCase();

        return answer.equals("yes")
                || answer.equals("y");
    }
}