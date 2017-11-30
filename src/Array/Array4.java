package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/**
 * Created by Ксюша on 30.11.2017.
 */
public class Array4 {


    public static void DifferentValues(int[] arr)
    {
        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        System.out.println(set.size());
    }

    public static void main(String[] args) {

        int[] ar ={1, 4, 5, 1, 1, 3};

        DifferentValues(ar);

    }
}
