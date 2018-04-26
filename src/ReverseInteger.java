/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-04-26 22:04
 **/
public class ReverseInteger {

  public int reverse(int x) {
    if (x == 0 || x == Integer.MIN_VALUE) {
      return 0;
    }
    boolean isPos = x > 0 ? true : false;
    x = x > 0 ? x : -x;
    int cur = 0;
    int pre = x;
    while (pre > 0) {
      int m = pre % 10;
      int tmp = cur * 10 + m;
      if ((tmp - m) / 10 != cur) {
        return 0;
      }
      cur = tmp;
      pre /= 10;
    }
    cur = isPos ? cur : -cur;
    return cur;
  }
}
