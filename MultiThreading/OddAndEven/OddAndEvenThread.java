package MultiThreading.OddAndEven;

public class OddAndEvenThread {
    private int count=1;
    private final int limit;

    public OddAndEvenThread(int limit){
        this.limit=limit;
    }

    public synchronized void printOdd(){
         while(count<=limit){
             while (count%2==0){
                 try{
                   wait();
                 }
                 catch (InterruptedException e){

                 }
             }
             System.out.println("Odd Number "+count);
             count++;
             notify();
         }
    }
    public synchronized void printEven(){

        while (count<=limit){
            while (count%2==1){
                try{
                  wait();
                }
                catch (InterruptedException e){

                }
            }
            System.out.println("Even Number "+count);
            count++;
            notify();
        }
    }


}
