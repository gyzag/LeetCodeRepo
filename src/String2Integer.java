/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-04-26 22:37
 **/
public class String2Integer {

  public int myAtoi(String str) {
    int res = 0;
    if (str == null || str.length() == 0) {
      return 0;
    }
    int start = -1;
    int len = str.length();
    boolean isPos = true;
    char[] chars = str.toCharArray();
    for (int i = 0; i < len; i++) {
      if (chars[i] != ' ') {
        start = i;
        break;
      }
    }
    // 全为空白
    if (start == -1) {
      return 0;
    }
    isPos = (chars[start] == '-') ? false : true;
    start = (chars[start] == '-') || (chars[start] == '+') ? start + 1
        : start;
    // 只有一个负号
    if (start >= len) {
      return 0;
    }
    for (int i = start; i < len; i++) {
      int v = chars[i] - 48;
      if (v < 0 || v > 9) {
        res = isPos ? res : -res;
        return res;
      }

      if (Integer.MAX_VALUE / 10 < res || Integer.MAX_VALUE / 10 == res
          && Integer.MAX_VALUE % 10 < v) {
        return (isPos ? Integer.MAX_VALUE : Integer.MIN_VALUE);
      }
      res = res * 10 + v;
    }

    res = isPos ? res : -res;

    return res;
  }
}
