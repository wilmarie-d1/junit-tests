import java.util.ArrayList;

public class Student {
    long id;
    String name;
    ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }
}
