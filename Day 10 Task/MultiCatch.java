package ErrorHandling;
public class Err {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try{
            System.out.println(arr[5]);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        finally{
            System.out.println("Reached the end of the code");
        }

    }
}
