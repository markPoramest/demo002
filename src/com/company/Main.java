package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z  = scan.nextInt();
        if(z==0){
            System.out.printf("%d",x+y);
        }
        else if(z==1){
            System.out.printf("%d",x-y);
        }
        else if(z==2){
            System.out.printf("%d",x*y);
        }
        else if(z==3 && y!=0){
            System.out.printf("%.2f",x/y);
        }
        else if(z==4 && y!=0){
            System.out.printf("%d",x%y);
        }
        else if(y==0 && (z>=0 && z<5)){
            System.out.printf("cannot divide by Zero");
        }
    }
}
