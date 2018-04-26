/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-04-26 22:03
 **/
public class ZigZagConversion {

  public String convert(String s, int numRows) {
    int length = s.length();
    if (s == null || length < numRows || numRows == 1 || length == 1) {
      return s;
    }
    StringBuilder[] res = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++) {
      res[i] = new StringBuilder();
    }
    int l = 0;
    while (l < length) {
      for (int i = 0; i < numRows && l < length; i++) {
        res[i].append(s.charAt(l++));
      }
      for (int i = numRows - 2; i > 0 && l < length; i--) {
        res[i].append(s.charAt(l++));
      }
    }
    for (int i = 1; i < res.length; i++) {
      res[0].append(res[i]);
    }

    return res[0].toString();
  }

  public void addData(String s, int start, int length, int numRows,
      StringBuilder[] res) {
    for (int i = 0; i < numRows && length > 0; i++) {
      res[i].append(s.charAt(start++));
      length--;
    }
    for (int i = 0; i < numRows - 2 && length > 0; i++) {
      res[numRows - i - 2].append(s.charAt(start++));
      length--;
    }
  }
}
