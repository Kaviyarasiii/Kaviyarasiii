package in.dev.gmsk._arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Exercises_1 {

    public static List<List<Integer>> findAllTheSubsets(int[] arr, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        findSubsetsHelper(arr, targetSum, 0, new ArrayList<>(), result);
        return result;
    }

    private static void findSubsetsHelper(int[] arr, int targetSum, int start, ArrayList<Integer> currentSubset, List<List<Integer>> result) {

        if (targetSum == 0) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }

        if (targetSum < 0) {
            return;
        }

        for (int i = start; i < arr.length; i++) {
            currentSubset.add(arr[i]);
            findSubsetsHelper(arr, targetSum - arr[i], i + 1, currentSubset, result);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }

    public static boolean containsArray(char[] arr1, char[] arr2) {

        if (arr1 == null || arr1.length == 0 || arr2 == null || arr2.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                j++;
            }
            i++;

            if (j == arr2.length) {
                return true;
            }
        }

        return false;
    }

    public static boolean containsArrayInString(String[] arr1, String[] arr2) {

        if (arr1 == null || arr1.length == 0 || arr2 == null || arr2.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (Objects.equals(arr1[i], arr2[j])) {
                j++;
            }
            i++;

            if (j == arr2.length) {
                return true;
            }
        }

        return false;
    }

    public static int getTargetNumber(int[] arr, int target) {

        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == target) {
                return m;
            } else if (arr[m] < target) {
                l = m + 1;
            } else {
               r = m - 1;
            }
        }
        return l;
    }
}
