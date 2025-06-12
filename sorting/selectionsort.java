import java.util.*;
class Main{
    static void selection(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                min=j;
            }
            swap(arr,min,i);
        }
    }
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void printarr(int []arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selection(arr);
        printarr(arr);
        
    }
}
