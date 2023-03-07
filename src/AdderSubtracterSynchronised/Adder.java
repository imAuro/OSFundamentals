package AdderSubtracterSynchronised;

public class Adder implements Runnable{
    Count count;


    Adder(Count count)
    {
        this.count=count;
    }


    @Override
    public void run() {
        //lock.lock();
        for( int i=1;i<100;i++)
        {
            synchronized (count){

                count.count+=i;
            }
        }
        //lock.unlock();
    }
}
