package AdderSubtracterSynchronised;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count c=new Count(0);

        Thread t1= new Thread(new Adder(c));
        Thread t2= new Thread(new Subtracter( c));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println((c.count));
    }

}
