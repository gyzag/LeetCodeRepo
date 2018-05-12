import java.util.ArrayList;
import java.util.List;

/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-05-12 23:44
 **/
public class CombinationSum {

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    if (candidates == null || candidates.length == 0) {
      return res;
    }
    backTracking(0, target, candidates, new ArrayList<Integer>(), res);
    return res;
  }

  public void backTracking(int curIndex, int curRemains, int[] a, List<Integer> curList,
      List<List<Integer>> res) {
    if (curRemains < 0) {
      return;
    }
    if (curRemains == 0) {
      res.add(new ArrayList<>(curList));
      return;
    }
    for (int i = curIndex; i < a.length; i++) {
      curList.add(a[i]);
      backTracking(i, curRemains - a[i], a, curList, res);
      curList.remove(curList.size() - 1);
    }
  }
}
