/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-04-25 23:12
 **/
public class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    if(s == null || s.length() == 0)
      return 0;
    int[] help = new int[256];
    int l = 0;
    int r = 0;
    int curM = 0;
    while(r < s.length()){
      int c = s.charAt(r);
      if(help[c] == 0 || help[c] - 1 < l){
        help[c] = r + 1;
        r++;
      }
      else{
        curM = Math.max(curM, r - l + 1);
        l = help[c];
        help[c] = r + 1;
      }

    }
    return curM;
  }
}
