/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-04-26 23:51
 **/
public class PalindromeNumber {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    String str = String.valueOf(x);
    if (str.length() == 1) {
      return true;
    }
    int start = 0;
    int end = str.length() - 1;
    while (start < end) {
      if (str.charAt(start) != str.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
}
