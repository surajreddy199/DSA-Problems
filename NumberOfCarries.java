public class NumberOfCarries {
    public static void main(String[] args) {
        int num1=238;
        int num2=563;
        int count=0;
        int k=0;

        while(num1>0 && num2>0){
            int r1=num1%10;
            int r2=num2%10;
            int sum=k+r1+r2;
            if (sum>=10){
                count++;
                k=1;
            }
            num1=num1/10;
            num2=num2/10;

        }
        System.out.println(count);
    }
    
}
