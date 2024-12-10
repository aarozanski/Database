package week_6.comparation;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class GenericQuickSort {

    // Generic method to sort a list using the quicksort algorithm
    public static <T> void quickSort(List<T> list, int low, int high, Comparator<T> comparator) {
        if (low < high) {
            // Partitioning the list and getting the pivot element's correct position
            int partitionIndex = partition(list, low, high, comparator);

            // Recursively sorting the elements before and after partition
            quickSort(list, low, partitionIndex - 1, comparator);
            quickSort(list, partitionIndex + 1, high, comparator);
        }
    }

    // Helper method to partition the list based on the pivot element
    private static <T> int partition(List<T> list, int low, int high, Comparator<T> comparator) {
        T pivot = list.get(high);
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // Comparing current element with the pivot
            if (comparator.compare(list.get(j), pivot) < 0) {
                i++;

                // Swapping elements if current element is less than the pivot
                T temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        // Swapping the pivot element to its correct position
        T temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1;
    }

    public static void main(String[] args) {
        // Example usage with Integer
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 7, 8, 9, 1, 5));
        Comparator<Integer> integerComparator = Integer::compare;
        quickSort(numbers, 0, numbers.size() - 1, integerComparator);
        System.out.println("Sorted numbers: " + numbers);

        // Example usage with String
        ArrayList<String> words = new ArrayList<>(List.of("banana", "apple", "cherry", "date"));
        Comparator<String> stringComparator = String::compareTo;
        quickSort(words, 0, words.size() - 1, stringComparator);
        System.out.println("Sorted words: " + words);
    }
}


