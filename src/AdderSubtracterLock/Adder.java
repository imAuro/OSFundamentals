package AdderSubtracterLock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Count count;
    Lock lock;

    Adder(Lock lock,Count count)
    {
        this.lock=lock;
        this.count=count;
    }


    @Override
    public void run() {
        lock.lock();
        for( int i=1;i<100;i++)
        {
            count.count+=i;
        }
        lock.unlock();
    }
}
