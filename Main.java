import java.util.*;
public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  StudentManager manager = new StudentManager();
  while (true){
    System.out.println("==== Student Management System ====");
    System.out.println("1. Add Student");
    System.out.println("2. View All Students");
    System.out.println("3. Exit");
    System.out.print("Enter your choice: ");
    int choice = sc.nextInt();
    sc.nextLine();
    switch(choice){
      case 1:
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        Student student = new Student(id,name,age,course);
        manager.addStudent(student);
        break;
      case 2:
        manager.viewAllStudents();
        break;
      case 3:
        System.out.println("Exiting program...");
        sc.close();
        return;
      default:
        System.out.println("Invalid choice. Try again.");
    }
  }
}
}
