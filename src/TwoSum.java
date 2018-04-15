import java.util.HashMap;
import java.util.Map;

/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-04-15 23:29
 **/
public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    // hash
    Map<Integer, Integer> map = new HashMap<>();
    int index = 0;
    for(int i : nums){
      if(map.containsKey(target - i))
        return new int[]{map.get(target - i), index};
      else
        map.put(i, index);
      index++;
    }
    return null;
  }
}
