package week_6.genericsSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        numbers.add(4);

        System.out.println("Original list: " + numbers);
        GenericSorting.sort(numbers, Comparator.naturalOrder());
        System.out.println("Sorted list: " + numbers);

        // Example with custom objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Carol", 35));

        System.out.println("\nOriginal list of people:");
        people.forEach(person -> System.out.println(person.name + " - " + person.age));

        GenericSorting.sort(people, Comparator.comparingInt(person -> person.age));

        System.out.println("Sorted list of people by age:");
        people.forEach(person -> System.out.println(person.name + " - " + person.age));
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

