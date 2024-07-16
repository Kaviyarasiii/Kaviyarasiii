package in.dev.gmsk._arrays;

import java.util.List;

public interface _Collection {

    int[] remove(int[] arr, int targetNum);

    List<Integer> remove(List<Integer> arr, int targetNum);

    boolean contains(int[] arr, int target);

    boolean contains(List<Integer> list, int target);
}
