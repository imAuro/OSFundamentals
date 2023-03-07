package ProducerConsumer;

import java.util.Queue;

public class Consumer implements  Runnable {
    int maxSize=0;
    Queue<Object> objects;
    public Consumer(int maxSize, Queue<Object> objects){
        this.maxSize=maxSize;
        this.objects=objects;
    }

    @Override
    public void run() {
        while(true)
        {
            if(objects.size()>0)
            {
                objects.remove();
            }

        }
    }
}
