import java.util.HashMap;

public class Challenge1_Algorithms1 {
    public static void main(String args[])
    {
        int[] testArray1 = {1,5,2,3,2,3,2,3,3,3,3,3,4,4,4,4};
        int[] testArray2 = {1,2,3,4,5};
        int[] testArray3 = {1,5,2,3,2,3,2,3,3,3,3,3,4,4,4,4};
        int[] testArray4 = {1,5,2,3,2,3,2,3,3,3,3,3,4,4,4,4};
        int[] testArray5 = {1,5,2,3,2,3,2,3,3,3,3,3,4,4,4,4};
        int targetSum1 = 5;
        int targetSum2 = 20;
        int targetSum3 = 5;
        int targetSum4 = 5;
        int targetSum5 = 5;

        //findPairs(testArray1, targetSum1);
        findPairs(testArray2, targetSum2);
        //findPairs(testArray3, targetSum3);
        //findPairs(testArray4, targetSum4);
        //findPairs(testArray5, targetSum5);
    }

    /**
     * 1. Create HashMap of Integers representing numbers, and booleans that represent the numbers "used" status (if it has been used)
     * 2. Loop through the given array
     *    a. check if the complement number (that helps it reach the sum) to the current number at the array index is already in hashmap
     *      i. if it is, check if it has not been "used" already (for other sums)
     *        - add the current number at array, making its used status to true
     *        - change the used status of the complement number to true
     *    b. if it is not a complement number, add it to the hashmap with used status being "false"
     * Time Complexity: O(n)
     */
    public static void findPairs(int[] testArray, int targetSum)
    {
        HashMap<Integer, Boolean> availableNums = new HashMap<Integer, Boolean>();

        for(int i = 0;i<testArray.length;i++)
        {
            if(availableNums.containsKey(targetSum - testArray[i]))
            {
                if(availableNums.get(targetSum-testArray[i]) == false) {
                    availableNums.put(targetSum - testArray[i], true);
                    availableNums.put(testArray[i] , true);
                    System.out.println("(" + testArray[i] + ", " + (targetSum - testArray[i]) + ")");
                }
            }
            else
            {
                availableNums.put(targetSum-testArray[i], false);
            }
        }


    }
}
