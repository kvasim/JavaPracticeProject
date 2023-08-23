package com.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoWayMergeSort {
    public static void main(String[] args) {
        int[] A= {99,5, 2,7,8,3,6,4};
        //apply two way merge sort
        System.out.println("Before sorting : "+Arrays.toString(A));

        //A = applyTwoWayMergeSort(A);
        A = mergeSort(A, 0, A.length-1);
        System.out.println("--------------------------");
        System.out.println("After Sorting : "+Arrays.toString(A));
    }

    private static int[] applyTwoWayMergeSort(int[] A) {
        int[] sortedArray ={A[0]};
        for(int i=1;i<A.length;i++) {
            int[] tempB={A[i]};
            sortedArray = mergeTwoArray(sortedArray, tempB);
        }
        return sortedArray;
    }

    private static int[] mergeSort(int[] A, int l, int h) {
        if(l<h) {
            int mid = (l+h)/2;
            mergeSort(A, l, mid);
            mergeSort(A, mid+1, h);
            //merge(A, l,mid,h);
            merge1(A, l,mid,h);
        }
        return A;
    }

    private static void merge1(int[] a, int l, int mid, int h) {


        //prepare sub array size
        int n1 = mid - l + 1;
        int n2 = h - mid;
        int[] subArrayA = new int[n1];
        int[] subArrayB = new int[n2];
        //prepare first sub array
        for(int i=0; i<n1;i++){
            subArrayA[i]=a[l+i];
        }
        for(int i=0; i<n2;i++){
            subArrayB[i]=a[mid+1+i];
        }
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(subArrayA[i]<subArrayB[j]) {
                a[k++] = subArrayA[i];
                i++;
            } else {
                a[k++] = subArrayB[j];
                j++;
            }
        }
        while(i<n1) {
            a[k++]=subArrayA[i];
            i++;
        }
        while(j<n2) {
            a[k++]=subArrayA[j];
            j++;
        }
        System.out.println(Arrays.toString(a)+", l="+l+", mid="+mid+", h="+h);
    }
    private static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    private static int[] mergeTwoArray(int[] a, int[] b) {
        int counterA=0, counterB=0;
        int[] sortedList = new int[a.length+b.length];
        int counter=0;
        while(counterA <a.length && counterB< b.length){
            if(a[counterA]<b[counterB]) {
                sortedList[counter++]=a[counterA];
                counterA++;
            } else {
                sortedList[counter++]=b[counterB];
                counterB++;
            }


        }
        /*counterA--;
        counterB--;*/
        while (counterA<a.length){
            sortedList[counter++]=a[counterA++];
        }
        while (counterB<b.length){
            sortedList[counter++]=b[counterB++];
        }
        return sortedList;
    }
}
