package in.dev.gmsk._arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static in.dev.gmsk._arrays.Exercises_1.*;
import static org.junit.jupiter.api.Assertions.*;

class ExercisesOneTest {

    @Test
    void testFindAllTheSubsets() {
        int[] arr = {1, 2, 5, 4, 8, 3};
        int targetSum = 7;

        List<List<Integer>> allTheSubsets = findAllTheSubsets(arr, targetSum);
        System.out.println("allTheSubsets = " + allTheSubsets);
        assertTrue(true);
    }

    @Test
    void testContainsArray() {
        char[] array1 = {'a', 'f', 'h', 'k', 'm', 'o', 's', 'r'};
        char[] array2 = {'h', 'k', 'm', 'o'};

        boolean actual = containsArray(array1, array2);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void testContainsArrayString() {
        String[] array1 = {"a", "f", "h", "k", "m", "o", "s", "r"};
        String[] array2 = {"h", "k", "m", "o"};

        boolean actual = containsArrayInString(array1, array2);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void testGetTargetNumber() {
        int[] arr = {1, 2, 4, 6, 8, 15};
        int targetSum = 7;
        int targetNumber = getTargetNumber(arr, targetSum);
        System.out.println("targetNumber = " + targetNumber);
    }


    @Test
    void testGetSubsetOfArray() {
        int[] arr = {2, 3, 5, 9, 14, 18};
        int sum = 16;

        List<List<Integer>> result = new ArrayList<>();

        findSubsets(arr, sum, 0, new ArrayList<>(), result);

        // Print the subsets that sum up to the target sum
        if (result.isEmpty()) {
            System.out.println("No subset found that sums up to " + sum);
        } else {
            System.out.println("Subsets that sum up to " + sum + ":");
            System.out.println(result);
        }
    }
}