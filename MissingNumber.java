
import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {

        int[] nums={1,0,2};
        missingNum(nums);
       

        

        
    }

    static void missingNum(int[] nums){
        Arrays.sort(nums);

        for(int j=0;j<nums.length;j++){
            
           System.out.println(nums[j]);
        }
        int i=0;
        int k=nums[0];

        for(i=0;i<nums.length;i++){
            if(nums[i]==k){
                k++;
            }
            else if (k==nums.length){

            
            System.out.println(k+1);
        }
            else
            {
            System.out.println(k);
            }
        
        }


    }

    }
    

