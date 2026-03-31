package MultiThreading.customLocks;

import com.sun.source.tree.WhileLoopTree;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReenTrantLock {

    ReentrantLock lock=new ReentrantLock();
    private Condition oddLock= lock.newCondition();
    private Condition evenLock=lock.newCondition();



    private int count=1;
    private final int limit;

    ReenTrantLock(int limit){
        this.limit=limit;
    }

    public void printOdd(){
        while (true){
          lock.lock();
          try{
              if(count>limit)return;
            while (count%2==0){
                oddLock.await();
            }

              System.out.println(Thread.currentThread().getName() + " -> " + count);
              count++;
              evenLock.signal();
          }
          catch (Exception e){
             System.out.println(e.getMessage());
          }
          finally {
              lock.unlock();
          }
        }
    }

    public void printEven(){
        while(true){
          lock.lock();
            try{
                if(count>limit)return;
                while (count%2==1){
                    evenLock.await();
                }
                System.out.println(Thread.currentThread().getName() + " -> " + count);
                count++;
                oddLock.signal();
            }
            catch (Exception e){
             System.out.println("This is the exception that we are getting "+e.getMessage());
            }
            finally {
                lock.unlock();
            }

        }
    }


}
