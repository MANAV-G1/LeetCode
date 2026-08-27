import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        int n = arr.length;

        HashSet<List<Integer>> setAns = new HashSet<>();

        for (int i = 0; i < n; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < n; j++) {

                int com = -(arr[i] + arr[j]);

                if (set.contains(com)) {

                    List<Integer> list = new ArrayList<>();

                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(com);

                    Collections.sort(list);

                    setAns.add(list);
                }

                set.add(arr[j]);
            }
        }

        return new ArrayList<>(setAns);
    }
}