package hashSetTest;

import java.util.HashSet;

public class HashCodeTest {
   public static void main(String[] args) {
      Student student1 = new Student(1, "한동석");
      Student student2 = new Student(1, "한동석");
      
      System.out.println(student1.equals(student2));
      
      HashSet<Student> studentSet = new HashSet<Student>();
      
      studentSet.add(student1);
      studentSet.add(student2);
      
      System.out.println(studentSet.size());
   }
}