import java.util.*;
// создаем класс StudentGroup и простой метод listIterator(),
// который согласно заданию позволяет начать итерацию с помощью GroupListIterator.

public class StudentGroup implements Iterable<Student> {
    private ArrayList<Student> studentList = new ArrayList<>();

    public StudentGroup(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public int getSize() {
        return studentList.size();
    }

    public Student get(int index) {
        return studentList.get(index);
    }


    @Override
    public Iterator<Student> iterator() {
        return studentList.iterator();
    }


    public GroupListIterator listIterator() {
        return new GroupListIterator(studentList);
    }
}
