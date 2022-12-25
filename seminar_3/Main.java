import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList <Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", LocalDate.of(2000, 1, 1), 4.2f));
        studentList.add(new Student("Petr", LocalDate.of(2001, 2, 15), 4.8f));
        studentList.add(new Student("Julia", LocalDate.of(1998,10, 12), 5.0f));
        studentList.add(new Student("Adam", LocalDate.of(2000, 4, 21), 3.7f));
        StudentGroup students = new StudentGroup(studentList);

// Создаем группу студентов. С помощью метода listIterator() перебираем ее.
        StudentGroup studentGroup = new StudentGroup(studentList);
        GroupListIterator groupListIterator = studentGroup.listIterator();
        while (groupListIterator.hasNext()) {
            System.out.println(groupListIterator.next());
        }
        System.out.println();
    // создаем объект класса ReverseIterator. С его помощью перебираем список студентов в обратном порядке.
        ReverseIterator reverseIterator = new ReverseIterator(students);
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}