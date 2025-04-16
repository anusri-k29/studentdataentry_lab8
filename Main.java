/*
Name: Anusri Kadam
PRN: 23070126016
Batch: SY AIML A1
*/

import java.util.*;
import exceptions.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();

        int choice;
        do {
            System.out.println("1. Add Student\n2. Display All Students\n3. Search by PRN\n4. Search by Name");
            System.out.println("5. Search by Position\n6. Update Student\n7. Delete Student\n8. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scan.nextLine());
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = scan.nextLine();
                        System.out.print("Enter PRN: ");
                        int prn = Integer.parseInt(scan.nextLine());
                        System.out.print("Enter Branch: ");
                        String branch = scan.nextLine();
                        System.out.print("Enter Batch: ");
                        String batch = scan.nextLine();
                        System.out.print("Enter CGPA: ");
                        float cgpa = Float.parseFloat(scan.nextLine());

                        Student student = new Student(name, prn, branch, batch, cgpa);
                        operations.addStudent(student);
                        break;
                    case 2:
                        operations.displayStudents();
                        break;

                    case 3:
                        System.out.print("Enter PRN: ");
                        int searchPrn = Integer.parseInt(scan.nextLine());
                        operations.searchByPRN(searchPrn);
                        break;
                      case 4:
                        System.out.print("Enter Name: ");
                        String searchName = scan.nextLine();
                        operations.searchByName(searchName);
                        break;

                    case 5:
                        System.out.print("Enter Position: ");
                        int pos = Integer.parseInt(scan.nextLine());
                        operations.searchByPosition(pos);
                        break;
                    case 6:
                        System.out.print("Enter PRN of Student to Update: ");
                        int updPrn = Integer.parseInt(scan.nextLine());
                        System.out.print("Enter New Name: ");
                        String newName = scan.nextLine();
                        System.out.print("Enter New Branch: ");
                        String newBranch = scan.nextLine();
                        System.out.print("Enter New Batch: ");
                        String newBatch = scan.nextLine();
                        System.out.print("Enter New CGPA: ");
                        float newCgpa = Float.parseFloat(scan.nextLine());
                        operations.updateStudent(updPrn, newName, newBranch, newBatch, newCgpa);
                        break;
                    case 7:
                        System.out.print("Enter PRN of Student to Delete: ");
                        int delPrn = Integer.parseInt(scan.nextLine());
                        operations.deleteStudent(delPrn);
                        break;

                    case 8:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 8);

        scan.close();
    }
}
