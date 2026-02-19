import java.util.*;
public class StudentManager{
  private ArrayList<Student> students;

// Constructor
public StudentManager() {
  students = new ArrayList<>();
}

//Add student
public void addStudent(Student student){
  students.add(student);
  System.out.println("Student added successfully.");
}

// View all students
public void viewAllStudents(){
  if(students.isEmpty()){
    System.out.println("No students found.");
    return;
  }
  for(Student student : students){
    student.displayStudent();
  }
}

  // Delete student by ID
  public void deleteStudent(int id){
    Iterator<Student> iterator = students.iterator();
  while(iterator.hasNext()){
    Student student = iterator.next();
    if(student.getId() == id){
      iterator.remove();
      System.out.println("Student deleted successfully.");
      return;
    }
  }
  System.out.println("Student not found.");
}
}
