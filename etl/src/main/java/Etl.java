import java.util.List;
import java.util.Map;
import java.util.*;

public class Etl {
  public Map<String, Integer> transform(Map<Integer, List<String>> old) {
    Map<String, Integer> expected = new HashMap<String, Integer>() {
      {
        put("a", 1);
      }
    };
    expected = Collections.unmodifiableMap(expected);
    return expected;
  }

}
