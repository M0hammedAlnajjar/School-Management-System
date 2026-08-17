import services.StudentService;
import utils.InputHandler;

public class SchoolApp {


    private StudentService studentService = new StudentService();
    private InputHandler input = new InputHandler();

    public static void main(String[] args) {
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