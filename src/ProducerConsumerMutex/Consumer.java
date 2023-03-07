package ProducerConsumerMutex;

import java.net.SocketOption;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Consumer implements  Runnable {
    int maxSize=0;
    Queue<Object> objects;
    Lock lock;
    public Consumer(int maxSize, Queue<Object> objects, Lock lock){

        this.lock=lock;
        this.maxSize=maxSize;
        this.objects=objects;
    }

    @Override
    public void run() {

        while(true)
        {
            lock.lock();
            if(objects.size()>0)
            {
                System.out.println(objects.size());
                objects.remove();
            }
            lock.unlock();
        }

    }
}
