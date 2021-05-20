package com.example.javapractice;

public class FirstSumOfNEvenNumbers {
    public FirstSumOfNEvenNumbers(int n){
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += 2 * i;
        }
        System.out.println("The Sum of the first even numbers is " + sum);
    }
}
