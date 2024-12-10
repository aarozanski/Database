package week_6.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparison {

    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
            list.add("Jasmine");
            list.add("Gleb");
            list.add("Bianca");
            list.add("Stepan");
            list.add("Azamat");
        System.out.println("Before sort: " + list);
        Collections.sort(list);
        System.out.println("After sort: " + list);

    }
}
