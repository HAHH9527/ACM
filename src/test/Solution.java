package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] input = {7, 3, 7, 3, 1, 3, 4, 1};
        int output = s.solution(input);
        System.out.println(output);
    }

    public int solution(int[] A) {
        int n = A.length;
        Set<Integer> locations = new HashSet<>();
        for (int loc : A) {
            locations.add(loc);
        }
        int numLocations = locations.size();
        Map<Integer, Integer> visited = new HashMap<>();
        visited.put(A[0], 1);
        int start = 0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;

        while (end < n - 1) {
            while (visited.size() < numLocations && end < n - 1) {
                end++;
                if (locations.contains(A[end])) {
                    visited.put(A[end], visited.getOrDefault(A[end], 0) + 1);
                }
            }

            while (visited.size() == numLocations) {
                minLen = Math.min(minLen, end - start + 1);
                if (visited.containsKey(A[start])) {
                    visited.put(A[start], visited.get(A[start]) - 1);
                    if (visited.get(A[start]) == 0) {
                        visited.remove(A[start]);
                    }
                }
                start++;
            }
        }

        return minLen;
    }
}
