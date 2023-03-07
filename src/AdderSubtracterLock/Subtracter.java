package AdderSubtracterLock;

import java.util.concurrent.locks.Lock;

public class Subtracter  implements  Runnable{
    Count count;
    Lock lock;

    Subtracter(Lock lock, Count count)
    {
        this.lock=lock;
        this.count=count;
    }

    @Override
    public void run() {
        //lock.lock();
        for( int i=1;i<1000;i++)
        {

            count.count-=i;
        }
        //lock.unlock();

    }
}
