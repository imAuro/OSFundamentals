package AdderSubtracterLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count c=new Count(0);
        Lock lock =new ReentrantLock();

        Thread t1= new Thread(new Adder(lock,c));
        Thread t2= new Thread(new Subtracter( lock,c));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println((c.count));
    }

}
