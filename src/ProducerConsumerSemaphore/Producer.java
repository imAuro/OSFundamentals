package ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    int maxSize;
    Queue<Object> objects;
    Semaphore producer;
    Semaphore consumer;
    public Producer(int maxSize,Queue<Object> objects,Semaphore producer,Semaphore consumer){
        this.maxSize=maxSize;
        this.objects=objects;
        this.producer=producer;
        this.consumer=consumer;
    }

    @Override
    public void run() {
        while(true)
        {
            try {
                producer.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(objects.size()<maxSize)
            {
                objects.add(new Object());
                System.out.println(objects.size());
            }
            consumer.release();
        }

    }
}
