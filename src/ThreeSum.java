import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-04-29 23:53
 **/
public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    int len = nums.length;
    List<List<Integer>> list = new LinkedList<>();
    if (len < 3) {
      return list;
    }
    Arrays.sort(nums);
    for (int k = 0; k < len - 2; k++) {
      if (k == 0 || nums[k] != nums[k - 1]) {
        for (int i = k + 1, j = len - 1; i < j; ) {
          if (nums[i] + nums[j] == -nums[k]) {
            list.add(Arrays.asList(nums[k], nums[i], nums[j]));
            while (j > i && nums[j] == nums[j - 1]) {
              j--;
            }
            while (j > i && nums[i] == nums[i + 1]) {
              i++;
            }
          }
          if (nums[i] + nums[j] < -nums[k]) {
            i++;
          } else {
            j--;
          }
        }
      }
    }
    return list;

  }
}
