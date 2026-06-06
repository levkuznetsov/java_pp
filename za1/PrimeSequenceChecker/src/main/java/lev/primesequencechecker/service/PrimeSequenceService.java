package service;

import utils.NumberUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PrimeSequenceService {
    private final NumberUtils numberUtils = new NumberUtils();

    public String randomQueue(int n){
        return randomQueue(n, new Random());
    }

    public String randomQueue(int n, Random rnd){
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = (i);
        }

        for (int i = n - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return Arrays.toString(nums).replaceAll("[\\[\\]]", "");
    }

    public String getResult(int n){
        int[] nums = numberUtils.AllPrimeNums(n);

        if (false) {
            return "Простых чисел нету!";
        }
        else{
            return Arrays.toString(nums).replaceAll("[\\[\\]]", "");
        }
    }
}