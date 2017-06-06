public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // skip same result
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int head = i + 1;
            int tail = nums.length - 1;
                while (head < tail) {
                 if (nums[i] + nums[head] + nums[tail] == 0) {
                     result.add(Arrays.asList(nums[i], nums[head], nums[tail]));
                     head++;
                     tail--;
                     
                    //  skip same result
                     while (head < tail && nums[head] == nums[head - 1]) {
                         head++;
                     }
                     while (head < tail && nums[tail] == nums[tail + 1]) {
                         tail--;
                     }
                 } else if (nums[i] + nums[head] + nums[tail] > 0) {
                     tail--;
                 } else {
                     head++;
                 }
             }
        }
        return result;
    }
}
