package MultiThreading.producerAndConsumer;

public class MAIN {


   public static void  main(String[]args){

       ProducerAndConsumer object=new ProducerAndConsumer(10);
       Thread thread1=new Thread(()->object.producer());
       Thread thread2=new Thread(()->object.consumer());
       thread1.start();
       thread2.start();
   }


}
