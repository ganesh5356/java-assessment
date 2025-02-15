package arrays;
import java.util.Arrays;

public class a4 {
    public static void main(String[] args) {
        int []arr={2,-3,5,8,1,0,-4};
        int min_array=Arrays.stream(arr)
                            .min()
                            .getAsInt();
        System.out.println("the minimum elemnent in an array:"+min_array);



    }
}

