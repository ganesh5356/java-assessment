
//implement factorial pgm using recursion
import java.util.Scanner;

public class factorial {
    static int fact(int n){
        if(n==0)return 1;
        if(n<0)return -1;
        else
        return n*(fact(n-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("factorial of a given "+n+" is "+fact(n));
    }
}
