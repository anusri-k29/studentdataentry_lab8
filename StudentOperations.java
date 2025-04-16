import java.util.*;
import exceptions.*;

public class StudentOperations {
    private ArrayList<Student> students;

    public StudentOperations() {
        students = new ArrayList<>();
    }
    // Add student with duplicate check and CGPA validation
    public void addStudent(Student student) throws DuplicatePRNException, InvalidCGPAException {
        for (Student s : students) {
            if (s.getPRN() == student.getPRN()) {
                throw new DuplicatePRNException("PRN already exists.");
            }
        }
        if (student.getCgpa() < 0.0 || student.getCgpa() > 10.0) {
            throw new InvalidCGPAException("CGPA must be between 0.0 and 10.0.");
        }
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student s : students) {
            s.display();
        }
    }
    public void searchByPRN(int prn) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getPRN() == prn) {
                s.display();
                return;
            }
        }
        throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }
    public void deleteStudent(int prn) throws StudentNotFoundException {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getPRN() == prn) {
                iterator.remove();
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }
}
