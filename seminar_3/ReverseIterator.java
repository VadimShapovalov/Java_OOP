import java.util.Iterator;
// В данном классе с помощью переопределения методов hasNext() и next() реализуем возможность вывода списка в обратном порядке.
public class ReverseIterator implements Iterator<Student> {
    private int index;
    private StudentGroup students;

    public ReverseIterator(StudentGroup students) {
        this.students = students;
        this.index = students.getSize() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Student next() {
        return students.get(index--);
    }
}
