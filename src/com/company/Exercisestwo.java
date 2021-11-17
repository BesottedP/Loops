package com.company;

public class Exercisestwo {
    public static int addEvens(int n){
        int total = 0;
        for (int i = 2; i <= n; i+=2){
            total += i;
        }
        return total;
    }

    public static void printSquaresBack(int n){
        for(int i = n; i > 0; i--){
            System.out.print(i * i);
            if (i > 1){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
    }

    public static void sillyNumbers(){
        for (int i = 0; i<3; i++){
            for (int n = 0; n<=9; n++){
                System.out.print(n);
                System.out.print(n);
                System.out.print(n);
            }
            System.out.println();
        }
    }

    public static void sillyNumbers2(){
        for (int i = 0; i<4; i++){
            for (int n = 9; n>=0; n--){
                    for(int x = n; x>=1; x--){
                        System.out.print(n);
                    }
                }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        System.out.println(addEvens(10));
        System.out.println(addEvens(13));
        System.out.println(addEvens(15));

        System.out.println(" ");

        printSquaresBack(10);
        printSquaresBack(8);
        printSquaresBack(7);

        System.out.println(" ");

        sillyNumbers();

        System.out.println(" ");

        sillyNumbers2();
    }
}