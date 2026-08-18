import entities.Student;
import services.StudentService;
import utils.InputHandler;

public class SchoolApp {

    private StudentService studentService =
            new StudentService();

    private InputHandler input =
            new InputHandler();

    public static void main(String[] args) {

        SchoolApp app = new SchoolApp();

        app.loadSampleData();
        app.run();
    }

    private void run() {

        boolean exit = false;

        while (!exit) {

            printMenu();

            int choice = input.getIntInput(
                    "Choose:",
                    1,
                    4
            );

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewAllStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    exit = true;
                    break;
            }
        }

        System.out.println("Goodbye.");
    }

    private void addStudent() {

        System.out.println();
        System.out.println("=== Add Student ===");

        String firstName =
                input.getStringInput("First Name:");

        String lastName =
                input.getStringInput("Last Name:");

        String phoneNumber =
                input.getStringInput("Phone Number:");

        Student student =
                studentService.addStudent(
                        firstName,
                        lastName,
                        phoneNumber
                );

        System.out.println(
                "Added: " + student.displaySummary()
        );
    }

    private void viewAllStudents() {

        System.out.println();
        System.out.println("=== All Students ===");

        if (studentService.getAll().isEmpty()) {

            System.out.println(
                    "No students found."
            );

            return;
        }

        for (Student student :
                studentService.getAll()) {

            System.out.println(student);
        }
    }

    private void searchStudent() {

        String id =
                input.getStringInput("Student ID:");

        Student student =
                studentService.searchById(id);

        if (student != null) {

            System.out.println(student);

        } else {

            System.out.println(
                    "Student not found."
            );
        }
    }

    private void printMenu() {

        System.out.println();
        System.out.println("=== School Menu ===");

        System.out.println("1. Add student");
        System.out.println("2. View all students");
        System.out.println("3. Search student by ID");
        System.out.println("4. Exit");
    }

    private void loadSampleData() {

        studentService.addStudent(
                "Ahmed",
                "Ali",
                "91234567"
        );

        studentService.addStudent(
                "Sara",
                "Mohammed",
                "92345678"
        );

        studentService.addStudent(
                "John",
                "Smith",
                "93456789"
        );
    }

    public InputHandler getInput() {

        return input;
    }

    public void setInput(
            InputHandler input
    ) {

        this.input = input;
    }

    public StudentService getStudentService() {

        return studentService;
    }

    public void setStudentService(
            StudentService studentService
    ) {

        this.studentService = studentService;
    }
}