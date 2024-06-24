package org.algo;

import org.helper.Swap;

public class BubbleSort {

    Swap swapNumbers = new Swap();
    public void Sort_Using_BubbleSort_Method_1(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1 ; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    swapNumbers.SwapNumbers(arr[i],arr[j],arr,i,j);
                }
            }
        }
    }

    public void Sort_Using_BubbleSort_Method_2(int arr[])
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = 0 ; j < arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    swapNumbers.SwapNumbers(arr[j],arr[j+1],arr,j,j+1);
                }
            }
        }
    }

    void bubbleSort(int arr[], int n)
    {
        // Base case
        if (n == 1)
            return;

        int count = 0;
        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1]){
                swapNumbers.SwapNumbers(arr[i], arr[i+1],arr,i,i+1);
                count++;
            }

        // Check if any recursion happens or not
        // If any recursion is not happen then return
        if (count==0)
            return;

        // Largest element is fixed,
        // recur for remaining array
        bubbleSort(arr, n-1);
    }
}
