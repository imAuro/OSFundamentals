package PrintNumbers;

public class PrintNumbers implements Runnable{

    int numbersToPrint;
    PrintNumbers(int number)
    {
        this.numbersToPrint=number;

    }

    @Override
    public void run() {
        System.out.println(numbersToPrint+"Thread: "+ Thread.currentThread().getName());


    }
}
