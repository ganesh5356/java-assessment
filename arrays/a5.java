package arrays;

public class a5 {
    public static void main(String[] args) {
        int [] arr={1,1,3,4,2,3,5,7,0};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans)
            ans=arr[i];
        }
        System.out.println(ans);
        
    }
}
