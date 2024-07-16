package in.dev.gmsk._arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
// import java.util.stream.Collectors;

public class Exercises_2 implements _Collection {

    private static final Exercises_2 instance = new Exercises_2();
    static int elementRemove = 11;

    public static void main(String[] args) {

        int[] arr = {44, 1, 24, 88, 10, 90, 66, 7, 4, 11};

        int[] newArray = instance.remove(arr, elementRemove);
        System.out.println("original Array = " + Arrays.toString(arr));
        System.out.println("new Array = " + Arrays.toString(newArray));
        sort(newArray);
        System.out.println("new Array with sorting = " + Arrays.toString(newArray));

        List<Integer> arrayList = Arrays.asList(44, 1, 24, 88, 10, 90, 66, 7, 4, 11);
        List<Integer> newList = instance.remove(arrayList, elementRemove);

        System.out.println("\noriginal ArrayList = " + arrayList);
        System.out.println("new ArrayList = " + newList);
        System.out.println("new ArrayList with sorting = " + newList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
    }

    @Override
    public int[] remove(int[] arr, int targetNum) {

        if (arr.length == 0 || !contains(arr, targetNum)) {
            return new int[0];
        }

        int[] returnArr = new int[arr.length - 1];
        int j = 0;

        for (int i : arr) {
            if (i != targetNum) {
                returnArr[j] = i;
                j++;
            }
        }
        return returnArr;
    }

    @Override
    public List<Integer> remove(List<Integer> arr, int targetNum) {
        List<Integer> returnList = new ArrayList<>();

        if (arr.isEmpty() || !contains(arr, targetNum)) {
            return returnList;
        }

        for (Integer e : arr) {
            if (e != targetNum) {
                returnList.add(e);
            }
        }
        return returnList;
        // return arr.stream().filter(e -> e != targetNum).collect(Collectors.toList()) // Java 8 futures
    }

    @Override
    public boolean contains(int[] arr, int target) {
        return Arrays.stream(arr).anyMatch(num -> num == target);
    }

    @Override
    public boolean contains(List<Integer> list, int target) {
        return list.stream().anyMatch(num -> num == target);
    }

    public static void sort(int[] arr) {

        if (arr.length == 0) {
            return;
        }

        int n = arr.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
