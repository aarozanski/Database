package week_6.genericsExample;

public class Printer<T> {
    T thingsToPrint;

    public Printer(T thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }

    public void print(){
        System.out.println(thingsToPrint);
    }
}
