package grades;

import java.util.Scanner;

public class UserInterface {

    Scanner scanner;
    GradeRegister gradeRegister;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.gradeRegister = new GradeRegister();
    }

    public void start() {
        String input;
        do {
            System.out.print("Points: " );
            input = this.scanner.nextLine();
            if (!(input.isEmpty())) {
                this.gradeRegister.add(Integer.parseInt(input));
            }
        } while (!(input.isEmpty()));
        this.gradeRegister.print();
    }

}
