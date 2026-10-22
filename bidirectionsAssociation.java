import java.util.*;

class student {
    private List<course> sub = new ArrayList<>();

    public void addCourse(course subject) {
        this.sub.add(subject);
        subject.addStudent(this);
    }

    public void getValues() {
        for (course c : sub) {
            System.out.println(c.getCourseName());
        }
    }
}

class course {
    private String courseName;
    private List<student> stu = new ArrayList<>();

    public course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(student name) {
        this.stu.add(name);
    }

    public String getCourseName() {
        return courseName;
    }
}

public class bidirectionsAssociation {
    public static void main(String[] args) {

        student s1 = new student();

        course c1 = new course("Java");
        course c2 = new course("Maths");

        s1.addCourse(c1);
        s1.addCourse(c2);

        s1.getValues();
    }
}