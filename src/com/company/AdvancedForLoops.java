package com.company;

public class AdvancedForLoops {

    public static void eights(){
        int num = 8;

        for (int i = 4; i>0; i--){

            for (int y=4; y>i; y--){
                System.out.print(" ");
            }
            for (int z=i; z>0; z--){
                System.out.print(num);
                System.out.print(num);
            }
            System.out.println(" ");
            num-=2;
        }
    }

    public static void alternate(int height){
        for (int i = 1; i <= height; i++){

            if (i%2 == 0){
                for (int x = i; x > 0; x--)
                    System.out.print(x);
            }
            else if (i%2 == 1){
                for (int y = 1; y <= i; y++)
                    System.out.print(y);
            }
            System.out.println(" ");
        }
    }

    public static void isoceles(int h){
      for (int i = 1; i <= h; i++){
          for (int y=h; y>i; y--){
              System.out.print(" ");
          }
          for (int x = 1; x<=i; x++){
              System.out.print(x);
          }
          for (int z = i-1; z>0; z--){
              System.out.print(z);
          }
          System.out.println(" ");
      }
    }

    public static void upSideDown(int start, int end){
        for (int i = start; i >= end; i--){
            for (int y=start; y>i; y--){
                System.out.print(" ");
            }
            for (int p=i; p>=end; p--){
                System.out.print(p);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        eights();
        System.out.println(" ");
        alternate(6);
        System.out.println(" ");
        isoceles(6);
        System.out.println(" ");
        upSideDown(9, 5);
    }
}
