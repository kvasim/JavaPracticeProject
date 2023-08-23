package com.datastructure;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] A = {3,55,7,1,9,2,44,5,76,11};
        System.out.println("Before sorting : "+ Arrays.toString(A));
        A = quickSort(A,0, A.length);
        System.out.println("After sorting : "+ Arrays.toString(A));
    }

    private static int[] quickSort(int[] a, int l, int h) {
        if(l<h){
            int p = partition(a, l,h);
            quickSort(a, l, p);
            quickSort(a, p+1,h);
        }
        return a;
    }

    private static int partition(int[] a, int l, int h) {
        int pivot = a[l];
        int i=l,j=h;
        while(i<j) {
            do{
                i++;
            } while (i<a.length-1 && a[i]<=pivot );
            do{
                j--;
            }while (a[j]>pivot);
            if(i<j){
                swap(a,i,j);
            }
        }
        swap(a, l, j);
        return j;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
