import java.util.ArrayList;
import java.util.List;

/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-05-11 21:45
 **/
public class GenerateParentheses {

  public List<String> generateParenthesis(int n) {
    List<String> res = new ArrayList<>();
    if (n <= 0) {
      return res;
    }
    char[] a = new char[2 * n];
    help(n, 0, 0, 0, a, res);
    return res;
  }

  public void help(int n, int i, int pre, int po, char[] a, List<String> list) {
    if (n == pre && n == po) {
      list.add(new String(a));
      return;
    }
    if (pre < n) {
      a[i] = '(';
      help(n, i + 1, pre + 1, po, a, list);
    }
    if (po < pre) {
      a[i] = ')';
      help(n, i + 1, pre, po + 1, a, list);
    }

  }
}
