import java.util.HashSet;

public class FirstDuplicate {
    public static int firstDuplicate(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : a) {
            if (!set.add(i)) {
                return i;
            }
        }
        return -1; // if no duplicates are found
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 3, 5, 4, 2, 1, 3};
        System.out.println("First duplicate: " + firstDuplicate(a));
    }
}
```

