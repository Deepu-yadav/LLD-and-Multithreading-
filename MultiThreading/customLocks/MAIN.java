package MultiThreading.customLocks;

public class MAIN {

    public static void main(String[]args){
        ReenTrantLock obj=new ReenTrantLock(10);
        Thread thread1=new Thread(()->obj.printEven());
        Thread thread2=new Thread(()->obj.printOdd());
        thread1.start();
        thread2.start();
    }
}
