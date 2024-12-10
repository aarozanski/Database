package week_6.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Comparator {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(99, "Arman", "Zhumabek", 15000);
        Employee emp2 = new Employee(143, "Arman", "Nagiev", 34000);
        Employee emp3 = new Employee(23, "Zaur", "Berish", 56000);
        //Arrays.sort(new Employee [] {emp1, emp2, emp3});
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        System.out.println("After sorting \n" + list);
    }

    public abstract int compare(Employee emp1, Employee emp2);
}

class Comparator2 extends Comparator {
    int id;
    String name;
    String surname;
    int salary;

    public Comparator2(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Comparator2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id ){
            return 0;
        }
        else if(emp1.id < emp2.id){
            return -1;
        }
        else {
            return 1;
        }
    }
}
