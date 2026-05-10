package lev.numberanalyzeservice.service;

public class NumberAnalyzeService {
    public boolean isDouble(String str){
        return str.contains(".");
    }

    public boolean isPositive(double num){
        return num > 0;
    }

    public double square(double num){
        return num * num;
    }

    public double sqrt(double num){
        return Math.sqrt(num);
    }

    public boolean isEven(int num){
        return num % 2 == 0;
    }

    public boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}