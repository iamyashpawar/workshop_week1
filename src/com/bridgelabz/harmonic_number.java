package com.bridgelabz;

public class harmonic_number
{

    public static void main(String[] args)
    {


    int n=100;
    double sum = 0;

        for(int i = 1 ; i<=n; i++) {
            if (n != 0)
            {

                sum = sum + 1.0 / i;
                System.out.println(sum);
            }

        }
    }



}
