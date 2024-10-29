

class even implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            if (i%2 == 0) {
                System.out.println("Even : " + i);
            }
            try {
                Thread.sleep(1000);
            }catch(Exception e){
                return;
            }
        }
    }
}

class odd implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            if (i%2 == 1) {
                System.out.println("Odd " + i);
            } try {
                Thread.sleep(1000);
            } catch (Exception exception){
                return;
            }
        }
    }
}

public class EvenOddMultiThreading {
    public static void main(String[] args) {
        even e = new even();
        odd o = new odd();
        Thread t1 = new Thread(e);
        Thread t2 = new Thread(o);
        t1.start();
        t2.start();
    }
}
   
