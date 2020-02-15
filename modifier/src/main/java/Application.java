import java.util.ArrayList;
import java.util.Collections;

public class Application {

    public static void main(String[] args) {

        Student cindy = new Student("Cindy", 80);
        Student mary = new Student("Mary", 95);
        Teacher solider = new Teacher("Solider", new ArrayList<>(Collections.singletonList(mary)));
        Teacher bob = new Teacher("Bob", new ArrayList<>(Collections.singletonList(cindy)));
        printStudentInfoUnderTeacher(solider);
        printStudentInfoUnderTeacher(bob);

    }

    public static void printStudentInfoUnderTeacher(Teacher teacher){
        ArrayList<Student> studentList = teacher.getStudentList();
        System.out.println("========================");
        System.out.println("Teacher " + teacher.getName() + " teach(es) this/these student(s)");
        for (Student student : studentList) {
            student.setGrade(student.getGrade() + 5);
            System.out.print("Name:" + student.getName());
            System.out.println("(Grade:" + student.getGrade() + ")");
        }
        System.out.println("========================");
    }
}
