package ProducerConsumerMutex;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{
    int maxSize;
    Queue<Object> objects;
    Lock lock;
    public Producer(int maxSize,Queue<Object> objects,Lock lock){
        this.lock=lock;
        this.maxSize=maxSize;
        this.objects=objects;
    }

    @Override
    public void run() {
        while(true)
        {
            lock.lock();
            if(objects.size()<maxSize)
            {
                System.out.println(objects.size());
                objects.add(new Object());
            }
            lock.unlock();
        }

    }
}
