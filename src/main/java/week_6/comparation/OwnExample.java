package week_6.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OwnExample {
    public static void main(String[] args) {

        List<Restaurant> restaurant = new ArrayList<>();
        Restaurant rest1 = new Restaurant("Tzuco", 5, 7);
        Restaurant rest2 = new Restaurant("RPM", 4, 5);
        Restaurant rest3 = new Restaurant("Ema", 3, 6);
        Restaurant rest4 = new Restaurant("Aba", 4, 6);
        Restaurant rest5 = new Restaurant("Nico", 2, 4);

        restaurant.add(rest1);
        restaurant.add(rest2);
        restaurant.add(rest3);
        restaurant.add(rest4);
        restaurant.add(rest5);

        System.out.println("Before sorting \n" + restaurant);

        Collections.sort(restaurant);
        System.out.println("After sorting \n" + restaurant);
    }
}

class Restaurant implements Comparable<Restaurant> {
    String name;
    int ratingStar;
    int numOfYears;

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", ratingStar=" + ratingStar +
                ", numOfYears=" + numOfYears +
                '}';
    }

    public Restaurant(String name, int ratingStar, int numOfYears) {
        this.name = name;
        this.ratingStar = ratingStar;
        this.numOfYears = numOfYears;
    }

    @Override
    public int compareTo(Restaurant anotherRest) {
        // First compare by ratingStar, descending
        int ratingCompare = Integer.compare(anotherRest.ratingStar, this.ratingStar);
        if (ratingCompare != 0) {
            return ratingCompare;
        }
        // If ratings are the same, compare by numOfYears, descending
        return Integer.compare(anotherRest.numOfYears, this.numOfYears);
    }
}
