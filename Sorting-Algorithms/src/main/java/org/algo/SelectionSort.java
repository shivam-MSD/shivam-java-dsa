package org.algo;

public class SelectionSort {

    public void SelectionSort(int arr[])
    {
        int length = arr.length;

        for(int i = 0; i < length-1 ;i++)
        {
            int min_element_index = i;
            for(int j = i+1;j < length; j++)
            {
                if(arr[j] < arr[min_element_index])
                {
                    min_element_index = j;
                }
            }

            int temp = arr[min_element_index];
            arr[min_element_index] = arr[i];
            arr[i] = temp;
        }
    }
}
