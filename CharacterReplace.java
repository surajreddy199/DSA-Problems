import java.util.*;

public class CharacterReplace {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch1='a';
        char ch2='p';
        System.out.println(" Enter the String");
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        for (int i=0;i<ch.length;i++){
            if(ch[i]==ch1){
                ch[i]=ch2;
            }
            else if(ch[i]==ch2){
                ch[i]=ch1;
            }

        }
        System.out.println(Arrays.toString(ch));
    }
}
