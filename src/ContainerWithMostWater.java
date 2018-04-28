/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-04-28 20:11
 **/
public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    if (height == null || height.length == 0 || height.length == 1) {
      return 0;
    }
    int start = 0;
    int end = height.length - 1;
    int ret = -1;

    while (start < end) {
      int curMax = (end - start) * Math.min(height[start], height[end]);
      if (curMax > ret) {
        ret = curMax;
      }
      if (height[start] < height[end]) {
        while (height[start] > height[start++]) {
          ;
        }
      } else {
        while (height[end] > height[end--]) {
          ;
        }
      }

    }

    return ret;
  }
}
