import java.util.*;
public class ComparableImp{
    public static void main(String[] args) {
      List<Student> s= new ArrayList<>();
      s.add(new Student(10,"john"));
      s.add(new Student(20,"alice"));
      s.add(new Student(40,"bob"));
      Collections.sort(s);
      for(Student stu: s){
        System.out.println(stu.rollno +" "+ stu.name);
      }

       

    }
}
class Student implements Comparable<Student>{
    int rollno;
    String name;
    Student(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }
    public int compareTo(Student s){
        return this.rollno-s.rollno;
    }
}
