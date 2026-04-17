class Music{
    void play(){
        System.out.println("Song is getting played");
    }
}
class Timer{
    void time(){
        System.out.println("Timer Started...");
    }
}

public class ThreadImp {
    public static void main(String[] args) {
        Music m = new Music();
        Timer t = new Timer();
        m.play();
        t.time();
    }
}
*/


class Music extends Thread{
    public void run(){
        System.out.println("Song is getting played");
    }
}
class Timer extends Thread{
    public void run(){
        System.out.println("Timer Started...");
    }
}

public class ThreadImp {
    public static void main(String[] args) {
        Music m = new Music();
        Timer t = new Timer();
        m.start();
        t.start();
    }
}


*/

class Timer1 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            try{
                System.out.println("Timer1:"+i);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
             
        }
    }

}
class Timer2 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Timer2:"+i);
        }
    }
}

public class ThreadImp{
    public static void main(String[] args) {
        Thread musicThread = new Timer1();
        Thread timerThread = new Timer2();   
        musicThread.start();
        timerThread.start();
    }
}
