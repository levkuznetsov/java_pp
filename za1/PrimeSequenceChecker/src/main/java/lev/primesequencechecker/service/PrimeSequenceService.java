package service;

import utils.NumberUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeSequenceService {
    NumberUtils numberUtils = new NumberUtils();

    public String randomQueue(int n){
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nums.add(i);
        }

        Collections.shuffle(nums);

        return nums.toString().replaceAll("[\\[\\]]", "");
    }

    public String getResult(int n){
        List<Integer> nums = numberUtils.AllPrimeNums(n);

        if (nums.isEmpty()) {
            return "Простых чисел нету!";
        }
        else{
            return nums.toString().replaceAll("[\\[\\]]", "");
        }
    }
}