import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriterToJson extends WriterToFile {

    public static void writeToJson(ArrayList<Student> students) {
        try (FileWriter writer = new FileWriter("studentsJson.json", false)) {
            writer.write("{" + "\n");
            int count = 0;
            for (Student student: students) {
                count +=1;
                if(count < 3) {
                    writer.write("\"" + student.getName() + "\"" + ":" + student.getGrade() + "," + "\n");
                } else {
                    writer.write("\"" + student.getName() + "\"" + ":" + student.getGrade() + "\n");
                }
            }
            writer.write("}" + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
