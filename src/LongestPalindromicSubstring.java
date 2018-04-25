/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-04-25 23:14
 **/
public class LongestPalindromicSubstring {
  public String longestPalindrome(String s) {
    if(s == null || s.length() == 0)
      return "";
    String res = s.substring(0, 1);
    for(int i = 0; i < s.length() - 1;i++){
      String s1 = help(s, i, i);
      String s2 = help(s, i, i + 1);
      String ss = s1.length() > s2.length() ? s1 : s2;
      res = ss.length() > res.length() ? ss : res;
    }
    return res;
  }

  public String help(String s, int l, int r){
    while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
      l--;
      r++;
    }
    return s.substring(l + 1, r);
  }
}
