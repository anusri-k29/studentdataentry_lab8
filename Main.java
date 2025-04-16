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

