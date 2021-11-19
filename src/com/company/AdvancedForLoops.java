package com.company;

public class AdvancedForLoops {

    public static void eights(){
        int num = 8;

        for (int i = 4; i>0; i--){

            System.out.println(" ");

            for (int y=4; y>i; y--){
                System.out.print(" ");
            }
            for (int z=i; z>0; z--){
                System.out.print(num);
                System.out.print(num);
            }
            num-=2;
        }
    }

    public static void main(String[] args) {
        eights();

    }
}
