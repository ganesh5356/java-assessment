public class Main {
    static void insertion(int []arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
    }
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

        public static void main (String[] args) {
            int []arr={1,2,3,4,5};
            insertion(arr);
            for(int val:arr){
                System.out.print(val+" ");
            }
        }
    }
