//Иван Иванов=4.8
//Мария Кузнецова=5.0
//Степан Кузьмин=3.6

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

            Student student1 = new Student("Иван Иванов", 4.8);
            Student student2 = new Student("Мария Кузнецова", 5.0);
            Student student3 = new Student("Степан Кузьмин", 3.6);
            students.add(student1);
            students.add(student2);
            students.add(student3);
            WriterToText.writeToText(students);
            WriterToJson.writeToJson(students);
            WriterToXml.writeToXml(students);
    }
}