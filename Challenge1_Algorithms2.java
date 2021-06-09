
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Challenge1_Algorithms2 {
    public static void main(String args[])
    {
        int[] testArray1 = {2, 4, 5, 1, 3, 5, 4};
        int[] testArray2 = {1, 4, 5, 1, 3, 5, 4};

       reconcileHelper(testArray1, testArray2);


        int[] testArray3 = {2, 5, 9, 1, 1, 1};
        int[] testArray4 = {1, 41, 54, 12, 3, 5, 44, 89, 18};

        reconcileHelper(testArray3, testArray4);
        reconcileHelper(testArray2, testArray4);
        reconcileHelper(testArray2, testArray3);
    }

    /**
     * 1. Create two arraylists which will hold the numbers that are different in both of the arrays respectively
     * 2. Make two sets where we will put all the numbers, uniquely
     * 3. Add all the numbers from the arrays in their respective sets (to make sure the sets have unique numbers)
     * 4. Call the findDifferences method, that returns an ArrayList with all the numbers that are uniquely in param2, as opposed to param1
     * 5. Print the output in the specified format
     * 6. Edgecase: if there are no differences, print N/A
     */
    public static void reconcileHelper(int[] a, int[] b)
    {
        ArrayList<Integer> areInA = new ArrayList<Integer>();
        ArrayList<Integer> areInB = new ArrayList<Integer>();


        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();

        for(int num: a)
            aSet.add(num);

        for(int num: b)
            bSet.add(num);

        areInA = findDifferences(b, aSet);
        areInB = findDifferences(a, bSet);

        System.out.println("Numbers in array a that aren't in array b: ");
        for(int num: areInB) {
            System.out.print(num + " ");
        }
        if(areInB.isEmpty())
            System.out.println("N/A");

        System.out.println("\nNumbers in array b that aren't in array a: ");
        for(int num: areInA) {
            System.out.print(num + " ");
        }
        if(areInA.isEmpty())
            System.out.println("N/A");
    }

    public static ArrayList<Integer> findDifferences(int[] arr, Set<Integer> set)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int num: arr)
            if(!set.contains(num))
                list.add(num);

        return list;
    }
}
