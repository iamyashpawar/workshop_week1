package com.bridgelabz;

public class distinct_element
{
    public static void main(String[] args)
    {
        /* Write a program to DISPLAY THE DISTINCTELEMENTS between two arrays?*/

        int[] arr1 = {10,20,30,54,74};
        int[] arr2 = {15,34,43,20,10};
       int [] arr3 = {};
        for(int i=0; i<= arr1.length;i++)
        {
            for (int j =0 ; j<= arr2.length; j++)
            {
                if (arr1[i] != arr2[j])
                {
                    System.out.println(arr1[i]);
                }
            }
        }


    }

}
