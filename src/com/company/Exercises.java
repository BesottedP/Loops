package com.company;

public class Exercises {

    public static int addOdds(int n){
        int sum = 0;
        int count = 1;
        while (count <= n){
            sum = sum + count;
            count = count + 2;
        }
        return sum;
    }

    public static int sumDigits(int n){
        int sum = 0;
        while (n>0){
            int last = n%10;
            sum += last;
            n = n/10;
        }
        return sum;
    }

    public static int howManyYears(double startpop, double endpop){
        double pop = startpop;
        int year = 0;
        while (pop < endpop){
            pop = pop * 1.0113;
            year += 1;
        }
        return year;
    }

    public static int printSum(int n){
        int sum = 0;
        int count = 0;
        while (count <= n) {
            sum = sum + count;
            count += 1;
            if (count <= n){
                System.out.print(count);
            }
            if (count <= (n-1)){
                System.out.print(" + ");
            }
        }
        System.out.print(" = ");
        return sum;
    }

    public static boolean isPerfectSquare(int n){
        int count = 1;
        int square = 0;
        while (addOdds(count) <= n){
            count = count + 2;
            square++;
        }
        return square * square == n;
    }



    public static void main(String[] args) {
        System.out.println(addOdds(4));
        System.out.println(addOdds(7));
        System.out.println(addOdds(18));

        System.out.println(" ");

        System.out.println(sumDigits(100));
        System.out.println(sumDigits(23));
        System.out.println(sumDigits(3829));

        System.out.println(" ");

        System.out.println(howManyYears(111.2,120));
        System.out.println(howManyYears(111.2,150));

        System.out.println(" ");

        System.out.println(printSum(6));
        System.out.println(printSum(8));
        System.out.println(printSum(23));

        System.out.println(" ");

        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(9));
        System.out.println(isPerfectSquare(24));
        System.out.println(isPerfectSquare(26));
    }
}

