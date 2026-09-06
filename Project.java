import java.util.ArrayList;
import java.util.Scanner;

class Member {

    private String name;

    Member(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void borrowBook() {
        System.out.println(name + " borrowed a book.");
    }
}


class Student extends Member {

    Student(String name) {
        super(name);
    }

    
    @Override
    void borrowBook() {
        System.out.println("Student: " + getName());
        System.out.println("Book issued successfully.");
        System.out.println("Maximum books allowed: 3");
    }
}


// Inheritance
class Teacher extends Member {

    Teacher(String name) {
        super(name);
    }

    @Override
    void borrowBook() {
        System.out.println("Teacher: " + getName());
        System.out.println("Book issued successfully.");
        System.out.println("Maximum books allowed: 5");
    }
}


public class Project {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Member> members = new ArrayList<>();

        System.out.println("======================================");
        System.out.println("       CITY LIBRARY MANAGEMENT");
        System.out.println("======================================");

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter teacher name: ");
        String teacherName = sc.nextLine();

        members.add(new Student(studentName));
        members.add(new Teacher(teacherName));

        System.out.println("\n========== BOOK ISSUE ==========");

        for (Member m : members) {

            System.out.println("\nMember Name: " + m.getName());
            m.borrowBook();

            System.out.println("Status: ISSUED");
            System.out.println("-------------------------------");
        }

        System.out.println("\nThank you for using City Library!");

        sc.close();
    }
}
