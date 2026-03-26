class Student{
    int roll;
    String name;
    public Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    void display(){
        System.out.println("Roll Num: " + roll + "\nName: " + name);
    }
}
public class ThisClass{
    public static void main(String[] args) {
        Student ob = new Student(3123, "Dharun");
        ob.display();
    }
}
