import java.util.*;
public class RemoveImp{
public static void main(String[] args){
     List<Integer> list = new ArrayList<>();
         list.add(10);
         list.add(20);
         list.add(31);
         list.add(35);
         System.out.println(list);
         for(Integer i: list){
            if(i%2 ==0){
                list.remove(i);
            }
         }
         System.out.println(list);
}
}
