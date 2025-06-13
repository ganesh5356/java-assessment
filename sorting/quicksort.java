class Main{
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void printarr(int []arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    static void quicksort(int []arr,int st,int end){
        if(st>=end)
        return;
        int  pi=partition(arr,st,end);
        quicksort(arr,st,pi-1);
        quicksort(arr,pi+1,end);
    }
    static int partition(int []arr,int st,int end){
        int piv=arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=piv)count++;
        }
        int pivindx=st+count;
        swap(arr,st,pivindx);
        
        int i=st,j=end;
        while(i<pivindx && j>pivindx){
            while(arr[i]<=piv)i++;
            while(arr[j]>piv)j--;
            if(i<pivindx && j>pivindx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivindx;
        
    }
    public static void main (String[] args) {
        int []arr={10,25,6,9,8,52,0};
        quicksort(arr,0,arr.length-1);
        printarr(arr);
        
    }
}
