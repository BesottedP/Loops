package com.company;

public class Exercises {

    public static int addOdds(int n){
        int sum = 0;
        int count = 1;
        while (count < n){
            sum = count;
            count = count + 2;
        }
        return sum;
    }

    public static int sumDigits(int n){
        int sum = 0;
        while (n>0){
            int last = n%10;
            sum = sum + last;
            n = n/10;
        }
        return sum;
    }

    public static int howManyYears(double startpop, double endpop){
        double pop = startpop;
        int year = 0;
        while (pop < endpop){
            pop = pop * 1.13;
            year += 1;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(addOdds(19));

        System.out.println(" ");

        System.out.println(sumDigits(100));
        System.out.println(sumDigits(23));
        System.out.println(sumDigits(3829));

        System.out.println(" ");

       // System.out.println(howManyYears(111.2,120));
        System.out.println(howManyYears(111.2,150));
          }
}

