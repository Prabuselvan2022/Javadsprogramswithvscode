import java.util.*;
public class TwoSum {
    
    public static void main(String[] args) {
        int nums[] = new int [] {2,7,11,15};
        int target = 9;
            int temp[] = twoSum(nums,target);

            System.out.println("op--> "+ Arrays.toString(temp));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            int complement=target-nums[i];
            System.out.println("complement --> " +complement);
            if(hmap.containsKey(complement) ) {

                System.out.println(" map values --> " + hmap);
                return new int [] {hmap.get(complement),i};


            }
            hmap.put(nums[i],i);
        }

        throw new IllegalArgumentException("Invalid number");
    }

        public static int[] twoSum1(int[] nums, int target) {

            for(int i=0; i<nums.length; i++ ){
                for (int j=i+1; j<nums.length; j++) {

                    int complement = target-nums[i];

                    if(complement == nums[j] )  {
                        System.out.println(" i --> "+ i + " j --> "+ j);
                        return new int [] {i, j};
                    }

                }
            }
           throw new  IllegalArgumentException("No match found ");
        }
}
