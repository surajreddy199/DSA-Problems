import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        
    
    int arr[]={4,2,7,4,9};
    int n=arr.length;

    for(int i=0;i<n-1;i++){
        for(int j=i;j>=0;j--){
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

        }
    }
    System.out.println(Arrays.toString(arr));

}
}
