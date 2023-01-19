package seminar_5.model;

public class Student {
    private String name;
    private String groupName;
    private Integer age;
    private String gender;
    private Double percent;

    public Student(String name, String groupName, Integer age, String gender) {
        this.name = name;
        this.groupName = groupName;
        this.age = age;
        this.gender = gender;
    }

    public Student(String name, String groupName, Integer age, String gender, Double percent) {
        this.name = name;
        this.groupName = groupName;
        this.age = age;
        this.gender = gender;
        this.percent = percent;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(double value) {
        this.percent = value;
    }

    @Override
    public String toString() {
        return name + ", " + groupName + ", " + age + ", " + gender + ", " + percent + "%";
    }

}