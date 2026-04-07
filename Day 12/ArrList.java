import java.util.*;

public class ArrayListImplementation {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(null);
        arrayList.add(10);
        arrayList.add(20);
        System.out.println(arrayList);
        arrayList.set(0,5);
        System.out.println(arrayList);
        arrayList.set(0,0);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.lastIndexOf(0));
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        

    }
}
