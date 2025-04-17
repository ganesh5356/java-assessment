package recusions;

import java.util.Scanner;

public class fibonacci {
    static int fibc(int n){
        if(n==0 || n==1)return n;
        if(n<0)return -1;
        int pre=fibc(n-1);
        int pree=fibc(n-2);
        int ans=pre+pree;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibc(n));
    }
}
