package programm.group;

import java.time.LocalDate;
import java.util.ArrayList;

public class CourseRepository {
  private ArrayList<Course> courses= new ArrayList<>();
  private ArrayList<Student> students=new ArrayList<>();

  public CourseRepository(){
      Course c1 = new Course(1,"sistemi",25,5.6);
      Course c2 = new Course(5,"reti",50,11.6);
      courses.add(c1);
      courses.add(c2);

      Student s1 = new Student(1,"mario","rossi", LocalDate.of(2002,01,01));
      Student s2 = new Student(5,"roberto","bianchi", LocalDate.of(2009,02,02));
      students.add(s1);
      students.add(s2);
  }
  public ArrayList<Course> getAllCourses(){
      return courses;
  }
  public int addCourse(Course c){
      courses.add(c);
      return courses.size();
  }

    public ArrayList<Student> getAllStudents() {
        return students;
    }
    public void enrollStudent(Student s, int courseId){
      for(int i=0; i<courses.size()-1; i++){
          if(courses.get(i).getId()==courseId){
              courses.get(i).enrollStudent(s);
          }
      }
      students.add(s);
    }
    public ArrayList<Student> getAllEnrolledStudents(){
      ArrayList<Student> enrolled=new ArrayList<>();
        for (Course c:courses) {
           enrolled.addAll(c.getStudents());
        }
        return enrolled;
    }
}
