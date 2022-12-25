package lesson8;

import java.util.Scanner;

public class sumaOandE {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        int sumE = 0;
        int sumO = 0;
        System.out.println("Enter the number of elements: ");
        n= scn.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements: ");

        for(int i = 0; i < n; i++){
            a[i] = scn.nextInt();
             if (a[i]%2 ==0){
                    sumE = sumE + a[i];
                }
                else{
                    sumO = sumO + a[i];
                }
        }
            System.out.println("Sum of Even numbers is: " + sumE);
            System.out.println("Sum of Odd numbers is: " + sumO);

    }

}



