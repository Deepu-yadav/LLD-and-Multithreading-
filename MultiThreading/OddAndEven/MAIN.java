package MultiThreading.OddAndEven;

public class MAIN {

    public static void main(String[]args){

        OddAndEvenThread object=new OddAndEvenThread(100);
        Thread thread1=new Thread(()->object.printOdd());
        Thread thread2=new Thread(()->object.printEven());
        thread1.start();
        thread2.start();
    }
}
