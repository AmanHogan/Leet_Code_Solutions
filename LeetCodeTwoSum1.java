
package leetcodetwosum1;

/*
 * @author Aman Hogan-Bailey
 */
public class LeetCodeTwoSum1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Initializing array and target sum
        int [] sumArray = {2,7,11,15};
        int target = 9;
        
        int [] returnArray = new int[2];
        returnArray = twoSum(sumArray, target);
        
       for(int i = 0; i < returnArray.length; i++)
       {
           System.out.println(returnArray[i]);
       }
        
    }
    
    // Function returns the index of first two numbers whose sum equals the target number
    public static int[] twoSum(int[] nums, int target) 
    {
        // Initializing array to hold indecies
        int [] finalArray = new int [2];
        
        // Outer loop will act as the first operand
        for(int i = 0; i < nums.length; i++)
        {
            // Inner loop will act as the second operand
            for(int j = 0; j < nums.length; j++)
            {
                // Do not count the chosen index twice
                if(i == j)
                {
                    continue;
                }
                
                // If both operands equal the target number, return the array
                if (target == nums[i] + nums[j])
                {
                    finalArray[0] = i;
                    finalArray[1] = j;
                    break;
                }
            
            }
        
        }
        
        return finalArray;
    }
    
}
