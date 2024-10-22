import java.util.*;
public class NumOfDecreasingArrayEle {
    public static void main(String[] args) {
        int[] arr=new int[]{2,3,4,7,5,2,1,3};
        int count=0;
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                count++;

            }
            else
            count=0;
            max=Math.max(max, count);
        }
        System.out.println(max);
    }
    
}
