import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-04-29 23:58
 **/
public class LetterCombinationsOfAPhoneNumber {

  public List<String> letterCombinations(String digits) {
    List<String> res = new ArrayList<String>();
    if (digits == null || digits.length() == 0) {
      return res;
    }
    Map<Integer, String[]> map = new HashMap<>();
    map.put(0, new String[]{" "});
    map.put(1, new String[0]);
    map.put(2, new String[]{"a", "b", "c"});
    map.put(3, new String[]{"d", "e", "f"});
    map.put(4, new String[]{"g", "h", "i"});
    map.put(5, new String[]{"j", "k", "l"});
    map.put(6, new String[]{"m", "n", "o"});
    map.put(7, new String[]{"q", "p", "r", "s"});
    map.put(8, new String[]{"t", "u", "v"});
    map.put(9, new String[]{"w", "x", "y", "z"});
    backTrack(0, digits, new StringBuilder(), res, map);
    return res;
  }

  public void backTrack(int curI, String digits, StringBuilder curSB, List<String> res,
      Map<Integer, String[]> map) {
    if (curI == digits.length()) {
      res.add(curSB.toString());
      return;
    }
    int d = Integer.valueOf(digits.charAt(curI) - 48);
    for (String s : map.get(d)) {
      curSB.append(s);
      backTrack(curI + 1, digits, curSB, res, map);
      curSB.setLength(curSB.length() - 1);
    }
  }
}
