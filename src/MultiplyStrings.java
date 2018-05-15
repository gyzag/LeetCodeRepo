/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-05-15 23:34
 **/
public class MultiplyStrings {

  public String multiply(String num1, String num2) {
    if (num1 == null || num2 == null) {
      return "0";
    }
    if (num1.equals("0") || num2.equals("0")) {
      return "0";
    }
    int len1 = num1.length(), len2 = num2.length();
    int len = len1 + len2;
    char[] cnum1 = num1.toCharArray();
    char[] cnum2 = num2.toCharArray();
    int[] num = new int[len];

    // 先不进位
    for (int i = len1 - 1; i >= 0; i--) {
      for (int j = len2 - 1; j >= 0; j--) {
        num[i + j + 1] += (cnum1[i] - '0') * (cnum2[j] - '0');
      }
    }
    // 处理进位
    StringBuilder sb = new StringBuilder();
    int carry = 0;  // 进位
    for (int i = len - 1; i >= 0; i--) {
      num[i] += carry;
      carry = num[i] / 10;
      num[i] = num[i] % 10;
      sb.insert(0, num[i]);
    }
    // 去掉头部的0
    String s = sb.toString();
    int i = 0;
    for (; i < len; i++) {
      if (s.charAt(i) != '0') {
        break;
      }
    }
    ;
    return s.substring(i);
  }
}
