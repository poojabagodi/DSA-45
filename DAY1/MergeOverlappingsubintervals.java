package DAY1;
import java.util.*;

class Main {
    public static ArrayList<int[]> mergeSubintervals(int[][] mat) {
        ArrayList<int[]> ans = new ArrayList<>();

        // Step 1: Sort by starting value of intervals
        Arrays.sort(mat, (a, b) -> a[0] - b[0]);

        // Step 2: Initialize current interval
        int[] current = mat[0];

        // Step 3: Traverse and merge if overlapping
        for (int i = 1; i < mat.length; i++) {
            if (current[1] >= mat[i][0]) {
                // Overlapping: merge by updating end
                current[1] = Math.max(current[1], mat[i][1]);
            } else {
                // Not overlapping: add previous and update current
                ans.add(current);
                current = mat[i];
            }
        }

        // Add the last interval
        ans.add(current);

        return ans;
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        ArrayList<int[]> merged = mergeSubintervals(intervals);

        // Print the merged intervals
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
