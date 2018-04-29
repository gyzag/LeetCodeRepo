import java.util.Arrays;

/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-04-29 23:56
 **/
public class ThreeSumClosest {

  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int res = Integer.MAX_VALUE;
    int max = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
    int min = nums[0] + nums[1] + nums[2];
    if (target >= max) {
      return max;
    }
    if (target <= min) {
      return min;
    }
    for (int i = 0; i < nums.length - 2; i++) {
      if (i == 0 || nums[i] != nums[i - 1]) {
        int low = i + 1;
        int high = nums.length - 1;
        int sum = target - nums[i];
        while (low < high) {
          int sub = sum - nums[low] - nums[high];
          if (sub == 0) {
            return target;
          }
          if (sub > 0) {
            if (Math.abs(sub) < Math.abs(res)) {
              res = sub;
            }
            low++;
          } else {
            if (Math.abs(sub) < Math.abs(res)) {
              res = sub;
            }
            high--;
          }

        }
      }
    }
    return target - res;

  }
}
