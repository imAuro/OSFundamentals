package ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements  Runnable {
    int maxSize=0;
    Queue<Object> objects;

    Semaphore consumer;
    Semaphore producer;
    public Consumer(int maxSize, Queue<Object> objects, Semaphore consumer,Semaphore producer){
        this.maxSize=maxSize;
        this.objects=objects;
        this.consumer=consumer;
        this.producer=producer;
    }

    @Override
    public void run() {
        while(true)
        {
            try {
                consumer.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(objects.size()>0)
            {
                objects.remove();
                System.out.println(objects.size());
            }
            producer.release();

        }
    }
}
