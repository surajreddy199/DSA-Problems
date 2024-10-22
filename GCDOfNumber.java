import java.util.*;
import java.io.*;

public class GCDOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a = ");
        int a=sc.nextInt();
        System.out.print("enter b = ");
        int b=sc.nextInt();
        // int f=gcd(a,b);
        System.out.println("GCD of a and b is "+gcd(a,b));

    }
    public static int gcd(int c,int d){
        int result = Math.min(c,d);
        while(result>0){
            if(c%result==0 && d%result==0)
            return result;
            else
            result--;
        }
        // System.out.println(result);
        return result;
    }
    
}
