import java.util.*;
public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  StudentManager manager = new StudentManager();
  while (true){
    System.out.println("==== Student Management System ====");
    System.out.println("1. Add Student");
    System.out.println("2. View All Students");
    System.out.println("3. Delete Student");
    System.out.println("4. Search Student");
    System.out.println("5. Update Student");
    System.out.println("6. Exit");
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
        System.out.print("Enter ID to delete: ");
        int deleteId = sc.nextInt();
        sc.nextLine();
        manager.deleteStudent(deleteId);
        break;
      case 4:
        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();
        sc.nextLine();
        manager.searchStudent(searchId);
        break;
      case 5:
        System.out.println("Enter ID to update: ");
        int updateId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter new Name: ");
        String newName = sc.nextLine();
        System.out.print("Enter new Age: ");
        int newAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new Course: ");
        String newCourse = sc.nextLine();
        manager.updateStudent(updateId,newName,newAge,newCourse);
        break;
        
      case 6:
        System.out.println("Exiting program...");
        sc.close();
        return;
      default:
        System.out.println("Invalid choice. Try again.");
    }
  }
}
}
