// Q1 - Given an unsorted array arr[] of size N having both negative and positive integers, place
// all negative elements at the end of array without changing the order of positive elements
// and negative elements

// arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }

import java.util.*;
class a1{
    static void sorted(int []arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sorted(arr);
    }
}