import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriterToXml extends WriterToFile {

    public static void writeToXml(ArrayList<Student> students) {
        try (FileWriter writer = new FileWriter("studentsXml.xml", false)) {
            writer.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
            writer.write("<students>\n");
            for (Student student: students) {
                writer.write("<student>\n");
                writer.write("<name>" + student.getName() + "</name>\n");
                writer.write("<grade>" + student.getGrade() + "</grade>\n");
                writer.write("</student>\n");
            }
                writer.write("</students>");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
