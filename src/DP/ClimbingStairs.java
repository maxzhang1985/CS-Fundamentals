package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingStairs {
    public List<List<Integer>> climbStairs(int n) {
        // i = -2
        List<List<Integer>> resultPrevThree = new ArrayList<>();

        // i = -1
        List<List<Integer>> resultPrevTwo = new ArrayList<>();

        // i = 0
        List<List<Integer>> resultPrevOne = new ArrayList<>();
        List<Integer> listPrevOne = new ArrayList<>(Arrays.asList(0));
        resultPrevOne.add(listPrevOne);

        // i = 1 : n
        for (int i = 1; i <= n; i++) {
            List<List<Integer>> result = new ArrayList<>();
            addStep(result, resultPrevThree, i);
            addStep(result, resultPrevTwo, i);
            addStep(result, resultPrevOne, i);

            resultPrevThree = resultPrevTwo;
            resultPrevTwo = resultPrevOne;
            resultPrevOne = result;
        }

        return resultPrevOne;
    }

    private void addStep(List<List<Integer>> result, List<List<Integer>> resultPrev, int val) {
        for (List<Integer> listPrev : resultPrev) {
            List<Integer> list = new ArrayList<>(listPrev);
            list.add(val);
            result.add(list);
        }
    }
}
