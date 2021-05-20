package com.example.javapractice;

public class IncomeTax {
    public IncomeTax(int income){
        int b;
        if (income > 1000000){
           b = (income - 250000) * 30 / 100 + (500000 * 20/100) + (250000 * 5 / 100);
            System.out.println("TAX: " + b);
        } else if (income > 500000){
          b = (income - 500000) * 20/100 + (250000 * 5 / 100);
            System.out.println("TAX: " + b);
        } else if (income > 250000){
            b = (income - 250000) * 5 / 100;
            System.out.println("TAX: " + b);
        }else {
            System.out.println("NO TAX!!!");
        }
    }
}
