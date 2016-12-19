package io.github.ytam.Arrays;

import java.util.Scanner;

/**
 * Created by brusk on 12/12/16.
 */
public class Main2 {

    private static Scanner scan =new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers =myArray(6);
        printArray(myIntegers);

    }

    public static int[] myArray(int numbers){
        System.out.println("Enter "+numbers+" of integers.");
        int[] values =new int[numbers];

        for(int i=0; i<values.length;i++){
            values[i]=scan.nextInt();

        }
        return values;

    }

    public static void printArray(int[] array){

        for(int i=0;i<array.length ;i++){
            System.out.print(array[i]+"\n");
        }

    }

}
