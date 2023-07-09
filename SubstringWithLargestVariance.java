import java.util.ArrayList;
import java.util.List;

public class SubstringWithLargestVariance {
  // returns max variance for list containing 1 and 0, considering count(1) > count(0)
  public int getMaxVariance(List<Integer> list) {
    int maxVariance = 0;
    int startIndex = 0;
    int onesCount = 0;
    int zerosCount = 0;
    for (int endIndex = 0; endIndex < list.size(); endIndex++) {
      if (list.get(endIndex) == 1) {
        onesCount++;
      } else {
        zerosCount++;
        while (startIndex < endIndex && (zerosCount > onesCount)) {
          if (list.get(startIndex) == 0) zerosCount--;
          else onesCount--;
          startIndex++;
        }
        while (startIndex < endIndex && (list.get(startIndex) == 0)) {
          zerosCount--;
          startIndex++;
        }
      }
      if (onesCount > 0 && zerosCount > 0) {
        maxVariance = Math.max(maxVariance, onesCount - zerosCount);
      }
    }
    return maxVariance;
  }

  public int largestVariance(String s) {
    int result = 0;
    for (int i = 0; i < 26; i++) {
      for (int j = 0; j < 26; j++) {
        if (i == j) continue;
        List<Integer> list = new ArrayList<>();
        for (int k = 0; k < s.length(); k++) {
          int d = s.charAt(k) - 'a';
          if (d == i) list.add(1);
          if (d == j) list.add(0);
        }
        result = Math.max(result, getMaxVariance(list));
      }
    }
    return result;
  }
}
