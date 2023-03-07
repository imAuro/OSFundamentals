package AdderSubtracterSynchronisedMethod;

public class Subtracter  implements  Runnable{
    Count count;
    Subtracter( Count count)
    {

        this.count=count;
    }

    @Override
    public void run() {
        //lock.lock();
        for( int i=1;i<1000;i++)
        {

            count.addvalue(-i);
        }
        //lock.unlock();

    }
}
