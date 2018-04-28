/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-04-28 23:14
 **/
public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }
    String res = "";
    int index = 0;
    while (strs[0].length() > index) {
      char re = strs[0].charAt(index);
      boolean su = false;
      for (int i = 1; i < strs.length; i++) {
        if (strs[i].length() <= index || strs[i].charAt(index) != re) {
          su = true;
          break;
        }
      }
      if (su) {
        break;
      }
      res += String.valueOf(re);
      index++;
    }
    return res;

  }
}
