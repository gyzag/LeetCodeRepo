import java.util.Stack;

/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-04-30 22:51
 **/
public class ValidParentheses {

  public boolean isValid(String s) {
    if (s == null) {
      return false;
    }
    char[] chars = s.toCharArray();
    Stack<Character> stack = new Stack<>();
    for (char c : chars) {
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        char cc = stack.pop();
        if (c == ')') {
          if (cc != '(') {
            return false;
          }
        }
        if (c == ']') {
          if (cc != '[') {
            return false;
          }
        }
        if (c == '}') {
          if (cc != '{') {
            return false;
          }
        }
      }
    }
    if (stack.isEmpty()) {
      return true;
    }

    return false;
  }
}
