import java.util.*;
public class StudentManager{
  private ArrayList<Student> students;

// Constructor
public StudentManager() {
  students = new ArrayList<>();
}

//Add student
public void addStudent(Student student){
  for(Student s : students){
    if(s.getId() == student.getId()){
      System.out.println("Student with this ID already exists.");
      return;
    }
  }
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

  // Search student by ID
  public void searchStudent(int id){
    for (Student student : students){
      if(student.getId() == id){
        System.out.println("Student found:");
        student.displayStudent();
        return;
      }
    }
    System.out.println("Student not found.");
  }

  // Update student by ID
  public void updateStudent(int id, String name, int age, String course){
    for(Student student : students){
      if(student.getId() == id){
        student.setName(name);
        student.setAge(age);
        student.setCourse(course);
        System.out.println("Student updated successfully.");
        return;
      }
    }
    System.out.println("Student not found.");
}
}
