import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriterToText extends WriterToFile {

    public static void writeToText(ArrayList<Student> students) {
        try (FileWriter writer = new FileWriter("studentsText.txt", false)) {
            for (Student student: students) {
                writer.write(student.getName() + "=" + student.getGrade() + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
