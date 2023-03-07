package AdderSubtracterSynchronisedMethod;

public class Count {
    int count;

    public Count(int count) {

        this.count = count;
    }
    public synchronized  void addvalue(int value)
    {
        this.count+=value;
    }



}
