import java.util.*;
public class SelSort {
  public static void main(String[] args) {
    List<Integer> lst = new ArrayList<>();

    lst.addAll(Arrays.asList(5,2,3,1,6,4,7,9,8));

    List<Integer> sorted = new ArrayList<>();

    int t;

    while (!lst.isEmpty()) {
      int minPos = 0;
      for (int i = 1; i < lst.size(); i++) {
        if (lst.get(i) < lst.get(minPos)) {

          minPos = i;
        }

      }
      sorted.add(lst.get(minPos));
      lst.remove(minPos);
    }

    System.out.println(sorted);
  }
}
