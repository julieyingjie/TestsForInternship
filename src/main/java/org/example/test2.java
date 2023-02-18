package org.example;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 
 */

/*
 * inputNum1, represents the number X.
inputNum2, represents the number Y.
 */
public class Main
{
    public static int  funcCount(int inputNum1, int inputNum2)
    {
        // Write your code here
        int count = 0;
        for(int i = 1; i <= inputNum1; i++){
            int digitSum = 0;
            int n = i;
            while(n > 0){
                digitSum += n % 10;
                n /= 10;
            }
            if(digitSum == inputNum2){
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // input for inputNum1
        int inputNum1 = in.nextInt();

        // input for inputNum2
        int inputNum2 = in.nextInt();

        int count = funcCount(inputNum1,inputNum2);
        if(count == 0){
            System.out.println("-1");
        }else{
            System.out.println(count);
        }

        funcCount(inputNum1, inputNum2);
    }
}