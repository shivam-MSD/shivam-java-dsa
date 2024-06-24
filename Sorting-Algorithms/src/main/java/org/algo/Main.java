package org.algo;

public class Main {
    public static void main(String[] args) {

        int bubblesortnums[] = {1,-9,8,-10,90,-5,4,2,1,3};
        int result[] = {1,-9,8,-10,90,-5,4,2,1,3};

        System.out.println("--------------------------------------");
        System.out.println("Bubble sort :- ");
        System.out.println("--------------------------------------");

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Array before sorting :- ");
        printArray(bubblesortnums);
        bubbleSort.Sort_Using_BubbleSort_Method_1(bubblesortnums);
        System.out.println("Array after sorting :- ");
        printArray(bubblesortnums);

        bubblesortnums = result;

        System.out.println("Array before sorting :- ");
        printArray(bubblesortnums);
        bubbleSort.Sort_Using_BubbleSort_Method_2(bubblesortnums);
        System.out.println("Array after sorting :- ");
        printArray(bubblesortnums);
        System.out.println("--------------------------------------");

        int selectionssortnums[] = {1,-9,8,-10,90,-5,4,2,1,3};;

        System.out.println("\n--------------------------------------");
        System.out.println("Selection sort :- ");
        System.out.println("--------------------------------------");
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("Array before sorting :- ");
        printArray(selectionssortnums);
        selectionSort.SelectionSort(selectionssortnums);
        System.out.println("Array after sorting :- ");
        printArray(selectionssortnums);
        System.out.println("--------------------------------------");

    }

    public static void printArray(int nums[])
    {
        for(int i = 0; i < nums.length-1;i++)
        {
            System.out.print(nums[i] + ", ");
        }
        System.out.print(nums[nums.length-1]);

        System.out.println();
    }
}