package com.company;

public class Factorials {
    public static long calcFactorial(int n){
        long product = 1;
        int count = n;
        while (count > 0){
            product = product * count;
            count -= 1;
        }
        return product;
    }

    public static double calcE(){
        double e = 2.0;
        double olde = 1;
        int c = 2;
        while(e-olde > 0.001){
            olde = e;
            e += 1.0 / calcFactorial(c);
            c++;
        }
        return e;
    }

    public static double calcEX(int x){
        double e = 1.0;
        double olde = 0;
        int c = 1;
        int pow = 1;
        while(e-olde > 0.001){
            olde = e;
            e += Math.pow(x, pow) / calcFactorial(c);
            pow++;
            c++;
        }
        return e;
    }


    public static void main(String[] args) {
        for (int count = 1; count <= 20; count++){
            System.out.println(calcFactorial(count));
        }
        System.out.println(" ");

        System.out.println(calcE());

        System.out.println(" ");

        for (int count = 1; count <= 5; count++){
            double e = calcEX(count);
            System.out.printf("e^%d is %2.3f \n", count, e);
        }
    }
}
