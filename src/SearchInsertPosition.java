/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-05-12 23:43
 **/
public class SearchInsertPosition {

  public int searchInsert(int[] nums, int target) {
    int low = 0;
    int high = nums.length;
    while (low < high) {
      int mid = (low + high) / 2;
      if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
}
