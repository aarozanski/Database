package week_6.genericsExample;

public class Main {

    public static void main(String[] args) {
        Printer<Integer> intPrinter = new Printer<>(67);
        intPrinter.print();

        Printer<Double> doublePrinter = new Printer<>(99.9);
        doublePrinter.print();

        Printer<String> stringPrinter = new Printer<>("Hello");
        stringPrinter.print();

    }
}
