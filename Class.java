import java.util.ArrayList;
import java.util.List;

public class Class {

    private String subjectName;
    private String teacherName;
    private List<Student> students = new ArrayList<>();

    public Class(String subjectName, String teacherName, List<Student> students) {
        this.subjectName = subjectName;
        this.teacherName = teacherName;
        this.students = students;
    }



}
