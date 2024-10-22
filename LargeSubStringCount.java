import java.util.*;

public class LargeSubStringCount {
    public static void main(String[] args) {
        String str=new String("fjnvic.ccjfnfuihgderty.klsn.nnudkioruut.ckcjjv.");
        char[] ch=str.toCharArray();
        int count=0;
        int maxsum=0;
        for(int i=0;i<ch.length;i++){

            if(ch[i]!='.'){
                count++;
            }
            else
            {
                count=0;
            }
            maxsum=Math.max(maxsum, count);

        }
        System.out.println(maxsum);

    }
    
}
