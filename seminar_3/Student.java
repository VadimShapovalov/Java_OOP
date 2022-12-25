import java.time.LocalDate;
// создаем класс Student c несколькими стандартными полями. Прописываем контструктор. Переопределяем toString()
public class Student {
    private String name;
    private LocalDate dateBirthday;
    private float averageScore;

    public Student(String name, LocalDate dateBirthday, float averageScore) {
        this.name = name;
        this.dateBirthday = dateBirthday;
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateBirthday=" + dateBirthday +
                ", averageScore=" + averageScore +
                '}';
    }
}
