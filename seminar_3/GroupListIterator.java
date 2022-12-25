import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class GroupListIterator implements ListIterator<Student>, Iterable<Student>{
    private ArrayList<Student> students;

    private int index = -1;
    private int indexprevious;

// Создаем конструктор. Принимаем в качестве аргумента лист студентов.
    public GroupListIterator(ArrayList<Student> students) {
        this.students = students;
        this.indexprevious = students.size();
    }

// стандартный хез некст, меньше на единицу последнего индекса так как в некст я увеличиваю сразу индекс на единицу.
    @Override
    public boolean hasNext() {
        return index < students.size()-1;
    }

    @Override
    public Student next() {
        index++;
        return students.get(index);
    }
// реализуем возможность перебирать список с конца. Проверяем не выйдем ли мы за границы (начало) списка
    @Override
    public boolean hasPrevious() {
        return indexprevious > 0;
    }
// достаем из списка предыдущий элемент предварительно уменьшив индекс на единицу
    @Override
    public Student previous() {
        indexprevious--;
        return students.get(indexprevious);
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(Student student) {

    }

    @Override
    public void add(Student student) {

    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }
}
