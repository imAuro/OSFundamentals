package ProducerConsumer;

import java.util.Queue;

public class Producer implements Runnable{
    int maxSize;
    Queue<Object> objects;
    public Producer(int maxSize,Queue<Object> objects){
        this.maxSize=maxSize;
        this.objects=objects;
    }

    @Override
    public void run() {
        while(true)
        {
            if(objects.size()<maxSize)
            {
                objects.add(new Object());
            }
        }

    }
}
