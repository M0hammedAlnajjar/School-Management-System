import services.StudentService;
import utils.InputHandler;

public class SchoolApp {

    private StudentService studentService = new StudentService();
    private InputHandler input = new InputHandler();

    public static void main(String[] args) {
        SchoolApp app = new SchoolApp();
        app.loadSampleData();
        app.run();
    }

    private void run() {
        boolean exit = false;
        while (!exit) {
            printMenu();
            int choice = input.getIntInput("Choose:", 1, 4);
            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewAllStudents(); break;
                case 3: searchStudent(); break;
                case 4: exit = true; break;
            }
        }
        System.out.println("Goodbye.");
    }

    private void addStudent() {
    }

    private void viewAllStudents() {
    }

    private void searchStudent() {
    }

    private void printMenu() {
        System.out.println();
        System.out.println("=== School Menu ===");
        System.out.println("1. Add student");
        System.out.println("2. View all students");
        System.out.println("3. Search student by id");
        System.out.println("4. Exit");
    }

    private void loadSampleData() {
    }

    public InputHandler getInput() {
        return input;
    }

    public void setInput(InputHandler input) {
        this.input = input;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
}