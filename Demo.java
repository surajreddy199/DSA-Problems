public class Demo {
    public static void main(String[] args) {
        System.out.println("This is main Method");
        
        Demo obj=new Demo();
        obj.sum(2,3);
        obj.prod(5,6);

    }

    public void sum(int a,int b){
        int sum=a+b;

        System.out.println("Sum of and b is "+sum);
    }

    static void prod(int a,int b){
        System.out.println("Product of a and b is "+a*b);
    }
    
}
