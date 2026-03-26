class Student{
    int roll;
    String name;
    void display(int roll, String name){
        this.roll = roll;
        this.name = name;
        System.out.println("Roll Num: " + roll + "\nName: " + name);
    }
}
public class ThisClass{
    public static void main(String[] args) {
        Student ob = new Student();
        ob.display(3123, "Dharun");
    }
}
