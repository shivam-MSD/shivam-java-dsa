package org.helper;

public class Swap {
    public void SwapNumbers(int num1, int num2, int arr[],int i, int j)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        arr[i] = num1;
        arr[j] = num2;

    }
}
