package utils;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public List<Integer> AllPrimeNums (int n){
        List<Integer> nums = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            nums.add(i);
        }

        List<Integer> copy = new ArrayList<>(nums);

        for (int num : copy) {
            for (int i = 2; i <= n / num; i++) {
                Integer o = num * i;
                nums.remove(o);
            }
        }

        return nums;
    }
}