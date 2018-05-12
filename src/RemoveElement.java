/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-05-12 23:39
 **/
public class RemoveElement {

  public int removeElement(int[] nums, int val) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int currentNum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == val) {
        currentNum++;
      } else {
        nums[i - currentNum] = nums[i];
      }
    }

    int currentLength = nums.length - currentNum;

    return currentLength;


  }
}
